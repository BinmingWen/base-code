package Demo07OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
/*
   FileOutputStream(String name, boolean append)创建文件输出流以指定的名称写入文件。
   FileOutputStream(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
 */
public class Demo03OutputStremWriteApp {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("FileAndRecursion\\b.txt",true);
        for (int i = 0; i < 4; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
