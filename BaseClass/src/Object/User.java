package Object;

public class User implements Cloneable{
     int age;
     Address address;

    public User(int age) {
        this.age = age;
        address = new Address("广州天河");
    }

    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

}
