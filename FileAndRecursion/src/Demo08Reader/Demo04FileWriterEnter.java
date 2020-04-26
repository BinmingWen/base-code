package Demo08Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04FileWriterEnter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("FileAndRecursion\\f.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("嘉怡"+i+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
