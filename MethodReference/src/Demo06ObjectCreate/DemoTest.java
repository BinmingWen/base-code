package Demo06ObjectCreate;

public class DemoTest {
    public static void printName(String name, PersonBuilder personBuilder) {
        Person p = personBuilder.builderPerson(name);
        System.out.println(p.getName());
    }

    public static void main(String[] args) {
        printName("李白",(name)->{
            return new Person(name);
        });
        printName("张三",Person::new);
    }
}
