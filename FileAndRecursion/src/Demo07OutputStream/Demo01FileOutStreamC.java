package Demo07OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutStreamC {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutStream对象，并在构造方法中传递写入数据目的地
        FileOutputStream fileOutputStream = new FileOutputStream("FileAndRecursion\\a.txt");
        //2.调用write方法向文件中写入数据
        fileOutputStream.write(97);
        //3.释放资源
        fileOutputStream.close();

    }
}
