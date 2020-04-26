package Demo02FileUpAndDown;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\wenmingbin\\Pictures\\Camera Roll\\women.jpg");
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
       while ((len = fis.read(bytes)) != -1) {
            outputStream.write(bytes);
        }
        InputStream inputStream = socket.getInputStream();

        while ((len = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
            System.out.println(len);
        }

        fis.close();
        socket.close();
    }

}
