package Demo07OutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中要绑定读取的数据源
        FileInputStream fis = new FileInputStream("FileAndRecursion\\a.txt");
        //2.使用FileInputStream对象中的read方法，读取文件
        /*int len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);*/
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char)len);
        }
        //3.释放资源，关闭文件流
        fis.close();
    }
}
