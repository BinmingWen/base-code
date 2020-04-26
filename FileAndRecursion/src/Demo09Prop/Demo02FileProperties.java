package Demo09Prop;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo02FileProperties {
    public static void main(String[] args) throws IOException {
       /* FileWriter fw = new FileWriter("FileAndRecursion\\f.txt");*/
        FileOutputStream fos = new FileOutputStream("FileAndRecursion\\f.txt");
        Properties prop = new Properties();
       // prop.store(fw, "你好");
        prop.store(fos, "123");
        fos.close();
    }
}
