package Thread.Demo01SingleThread;

public class Person {
    String name;

    public Person() {
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(i+this.name);
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
