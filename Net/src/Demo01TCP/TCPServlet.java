package Demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServlet {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        int len=0;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到了，谢谢".getBytes());
        inputStream.close();
        socket.close();

    }
}
