package Demo07OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06FileCopy {
    public static void main(String[] args) throws IOException {
        //一读一写
        FileInputStream fis = new FileInputStream("C:\\Users\\wenmingbin\\Pictures\\Camera Roll\\women.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\picture\\we.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        //先关闭写后关闭读
        fos.close();
        fis.close();
    }
}
