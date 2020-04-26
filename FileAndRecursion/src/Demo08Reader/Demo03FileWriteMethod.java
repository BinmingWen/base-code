package Demo08Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03FileWriteMethod {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("FileAndRecursion\\f.txt");
        char[] cs = {'a', 'b', 'd'};
        //fw.write(cs);
        fw.write(cs,0,2);
        fw.flush();
        fw.write("五邑大学");
        fw.write("传许愿",0,2);
        fw.close();
    }
}
