package Demo09Prop;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo03PropertiesLoad {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("FileAndRecursion\\f.txt");
        FileReader fw = new FileReader("FileAndRecursion\\f.txt");
        Properties prop = new Properties();
        prop.load(fw);
        Set<String> set = prop.stringPropertyNames();
        for (String str : set) {
            String value = prop.getProperty(str);
            System.out.println(str+"="+value);
        }

    }
}
