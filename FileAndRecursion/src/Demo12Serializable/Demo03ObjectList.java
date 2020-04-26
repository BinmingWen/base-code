package Demo12Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo03ObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> list = new ArrayList<>();
        list.add(new Person(22, "张三"));
        list.add(new Person(23, "李四"));
        list.add(new Person(24, "王五"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
        Object o = ois.readObject();
        List<Person> l = (ArrayList<Person>)o;
        //System.out.println(l);
        l.forEach((obj)-> System.out.println(obj));
        oos.close();
        ois.close();
    }


}
