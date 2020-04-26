package Demo12Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("person.txt"));
        Object obj = ois.readObject();
        ois.close();
        Person o = (Person)obj;
        System.out.println(obj);
        System.out.println(o.getAge()+o.getName());
    }
}
