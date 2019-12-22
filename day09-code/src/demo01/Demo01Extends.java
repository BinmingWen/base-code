package demo01;

public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类
        Teacher teacher = new Teacher();

        //调用父类的方法
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
