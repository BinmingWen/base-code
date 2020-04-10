package Object;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address==u2.address);

    }

}
