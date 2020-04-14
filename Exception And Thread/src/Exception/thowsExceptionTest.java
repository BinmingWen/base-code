package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileNotFoundException ->IOException
 */
public class thowsExceptionTest {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            //System.out.println("文件后缀名不对");
            //getMessage()
            //返回此throwable的详细消息字符串
            //toString()
            //返回此可抛出的简短描述。
            // printStackTrace() 将此throwable和其追溯打印到标准错误流。
           /* System.out.println(e);
            System.out.println(e.toString());*/
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("后续代码");

    }

    private static void readFile(String s) throws IOException {
        if (s.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递文件路径不对");
        }
        if (!s.endsWith("txt")) {
            throw new IOException("后缀名不是txt文件");
        }
    }
}
