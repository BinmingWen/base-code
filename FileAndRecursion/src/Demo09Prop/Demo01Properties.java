package Demo09Prop;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("李白", "22");
        prop.setProperty("韩信", "33");
        prop.setProperty("赵元", "32");

        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
            String value = prop.getProperty(s);
            System.out.println(s+"="+value);
        }

    }
}
