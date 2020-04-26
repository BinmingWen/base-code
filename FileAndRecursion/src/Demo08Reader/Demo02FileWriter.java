package Demo08Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中要绑定写入数据的目的地
        FileWriter fw = new FileWriter("FileAndRecursion\\b.txt");
        //2.使用write方法，把数据写入到缓冲区中
        fw.write(97);
        //3.调用flush方法，吧缓冲区的内容，刷新到文件中来
        fw.flush();
        fw.write(98);
        //4.释放资源
        fw.close();    //Stream closed 文件关闭后，不能再写数据
        fw.write(99);
    }
}
