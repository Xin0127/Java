import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7016);
        OutputStream out = socket.getOutputStream();
        String message = "BTRMXXCLOSE";
        out.write(message.getBytes());
        out.close();
        socket.close();
    }
}
