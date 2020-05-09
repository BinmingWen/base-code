package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("username", "yeeku");
        pro.setProperty("password", "123456");
        pro.store(new FileOutputStream("F:\\intellij idea\\base-code\\Collection\\src\\Properties\\a.ini"), "comment line");

        Properties pro2 = new Properties();
        pro2.setProperty("gender", "male");
        pro2.load(new FileInputStream("F:\\intellij idea\\base-code\\Collection\\src\\Properties\\a.ini"));
        System.out.println(pro2);
    }
}
