package Demo10Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileInputStream字节缓冲流，
        FileInputStream fis = new FileInputStream("f.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        /*int len=0;
        while ((len = bis.read()) != -1) {
            System.out.println(len);
        }*/
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
