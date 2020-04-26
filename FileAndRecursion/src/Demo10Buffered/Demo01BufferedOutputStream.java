package Demo10Buffered;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象，并在构造方法中指出其目的地
        FileOutputStream fis = new FileOutputStream("f.txt");
        //2.创建BufferedOutputStream对象，并在构造方法中传递FileOutputStream对象，
        BufferedOutputStream bos = new BufferedOutputStream(fis);
        //3.调用write方法，把数据写入到缓冲区中
        bos.write("你好".getBytes());
        //4.调用flush方法，吧缓冲区中的数据刷新到文件中
        bos.flush();
        //5.关闭流
        bos.close();
    }
}
