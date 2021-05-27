package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream
//                = new FileOutputStream("d:/test.txt");
//        String s = "hello";
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("d:/test.txt");
        while (true) {
            int c = fileInputStream.read();
            if (c == -1) {
                // c 其实就是读取到的这个字节.
                // 如果要是读取文件完毕了, c 就会返回 -1
                break;
            }
            System.out.print((byte)c);
        }
        fileInputStream.close();
    }
}
