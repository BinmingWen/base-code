package Demo08Reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        //1.创建FilerReader对象，并在构造方法中绑定数据源
        FileReader fr = new FileReader("FileAndRecursion\\a.txt");
        //2.使用FilerReader对象中的reader方法读取文件
        /*int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }*/
        char[] buff = new char[1024];
        int len;
        while ((len = fr.read(buff)) != -1) {
            System.out.println(len);
            System.out.println(new String(buff,0,len));
        }
        System.out.println(len);
        //释放资源
        fr.close();
    }
}
