package demo06;
class Creature{
    public Creature() {
        System.out.println("Creature无参的构造方法");
    }
}

class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal带一个构造器,"+"该动物的名字为: "+name);
    }
    public Animal(String name,int age){
        this(name);
        System.out.println("Animal带两个构造器,"+"年龄为: "+age);
    }
}
public class Wolf extends Animal {
    public Wolf() {
        super("Tony",3);
        System.out.println("Wolf construtor");
    }

    public static void main(String[] args) {
        new Wolf();
    }


}
