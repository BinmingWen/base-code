package cn.wyu.Variable;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "码云";
        person.setAge(33);
        person.show();
    }
}
