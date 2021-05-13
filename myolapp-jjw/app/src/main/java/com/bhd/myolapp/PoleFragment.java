package com.bhd.myolapp;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/**
 * description: BedroomFragment 卧室<br>
 * date: 2021/4/10 1:08 <br>
 * author: DaTao <br>
 * version: 1.0 <br>
 */
public class PoleFragment extends Fragment {

    private SharedPreferences mSharedPreference;
    private static final String SP_TEST = "sp_test";
    private ImageView poleDpxs;

    private Button btnOpenPole;
    private Button btnClosePole;

    private String ip;
    private Integer port;

    private Button timeSelectPole;
    private TextView txtTimePole;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {

        View view = inflater.inflate(R.layout.pole_fragment, null);

        mSharedPreference = this.getActivity().getSharedPreferences(SP_TEST, Context.MODE_PRIVATE);

        btnOpenPole = view.findViewById(R.id.btn_open_pole);
        btnClosePole = view.findViewById(R.id.btn_close_pole);
        poleDpxs = view.findViewById(R.id.pole_dpxs);


        txtTimePole = view.findViewById(R.id.txt_time_pole);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ip = get("ip");
        String portStr = get("port");
        if (portStr != null) {
            port = Integer.parseInt(portStr);
        } else {
            port = 7016;
        }


        //开灯
        btnOpenPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMsg(ip, port, "pole_open");
            }
        });
        //关灯
        btnClosePole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMsg(ip, port, "pole_close");
            }
        });


    }






    @Override
    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putParcelable("android:support:fragments", null);
    }

    private String get(String key) {
        return mSharedPreference.getString(key, null);
    }


    /**
     * 发送消息
     *
     * @param ip
     * @param port
     * @param msg
     */
    private void sendMsg(final String ip, final int port, final String msg) {

        new Thread() {
            @Override
            public void run() {

                Socket socket = null;

                try {
                    SocketAddress saAdd = new InetSocketAddress(ip.trim(), port);
                    socket = new Socket();
                    socket.connect(saAdd, 1000);


                    final OutputStream outputStream = socket.getOutputStream();
                    // 将String转换成byte[]传输数据，使用UTF-8编码，服务端也使用UTF-8转换，支持中文
                    outputStream.write(msg.getBytes(StandardCharsets.UTF_8));

                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if ("pole_open".equals(msg)) {
                                poleDpxs.setImageResource(R.drawable.dp_light);
                                Toast.makeText(getActivity().getApplicationContext(), "已经打开", Toast.LENGTH_SHORT).show();
                            } else {
                                poleDpxs.setImageResource(R.drawable.dp_dark);
                                Toast.makeText(getActivity().getApplicationContext(), "已经关闭", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                    outputStream.close();
                } catch (UnknownHostException e) {
                    sendStatus("未知IP");
                } catch (SocketTimeoutException e) {
                    sendStatus("连接超时");
                } catch (IOException e) {
                    sendStatus("发送失败");
                    //e.printStackTrace();
                } catch (Exception e) {
                    sendStatus("发送失败");
                } finally {
                    try {
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void sendStatus(final String status) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getActivity().getApplicationContext(), status, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        mSharedPreference = this.getActivity().getSharedPreferences(SP_TEST, Context.MODE_PRIVATE);
        ip = get("ip");
        String portStr = get("port");
        if(portStr!=null){
            port = Integer.parseInt(portStr);
        }else{
            port = 7016;
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        mSharedPreference = this.getActivity().getSharedPreferences(SP_TEST, Context.MODE_PRIVATE);
        ip = get("ip");
        String portStr = get("port");
        if(portStr!=null){
            port = Integer.parseInt(portStr);
        }else{
            port = 7016;
        }
    }

}
