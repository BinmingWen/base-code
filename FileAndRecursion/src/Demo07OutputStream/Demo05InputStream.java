package Demo07OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo05InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("FileAndRecursion\\b.txt");
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
        System.out.println("---------");
        bytes = new byte[2];
        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
        System.out.println("---------");
        bytes = new byte[2];
        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));*/
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
