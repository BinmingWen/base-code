package Demo01SocketTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//BS案例
public class SocketTest {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动中，等待连接。。。。");
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        Socket socket = serverSocket.accept();
                        //把网络字节流，转换为字符流
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String s = br.readLine();
                        String[] s1 = s.split(" ");
                        String sub = s1[1].substring(1);

                        //读取第一行信心
                        FileInputStream fis = new FileInputStream(sub);

                        OutputStream out = socket.getOutputStream();
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        // 写入HTTP协议响应头,固定写法
                        out.write("HTTP/1.1 200 OK\r\n".getBytes());
                        out.write("Content‐Type:text/html\r\n".getBytes());

                        // 必须要写入空行,否则浏览器不解析
                        out.write("\r\n".getBytes());
                        while ((len = fis.read(bytes)) != -1) {
                            out.write(bytes, 0, len);
                        }
                        fis.close();
                        socket.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {


                    }
                }
            }.start();
        }
    }
   // serverSocket.close();
}
