package Demo02FileUpAndDown;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServlet {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Object obj = new Object();
        while (true) {
            synchronized (obj){
                String fileName = "E:\\picture\\"+System.currentTimeMillis()+ new Random().nextInt(99999)+".jpg";
                FileOutputStream fos = new FileOutputStream(fileName);
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                int len;
                byte[] bytes = new byte[1024];
                while ((len = inputStream.read(bytes)) != -1) {
                    fos.write(bytes,0,len);
                }
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("文件上传成功谢谢".getBytes());
                socket.close();
                fos.close();
            }

        }

        //serverSocket.close();
    }
}
