package Demo10Buffered;

import java.io.*;

public class Demo03BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\wenmingbin\\Pictures\\Camera Roll\\women.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\picture\\we.jpg"));

        /*int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }*/
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        //先关闭写后关闭读
        long s = System.currentTimeMillis();
        System.out.println("所用时间为："+(s-l));
        bos.flush();
        bos.close();
        bis.close();
    }
}
