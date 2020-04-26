package Demo12Serializable;

import java.io.Serializable;
/*
  static 和transient不能序列化
 */
public class Person implements Serializable {
    private static final long serialVersionUID=1L;
    private transient int age;
    public String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}
