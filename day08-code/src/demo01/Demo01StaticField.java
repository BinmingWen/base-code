package demo01;
//静态变量可以被共享使用
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("黄蓉",18);

        one.room = "101教室";
        System.out.println("姓名："+one.getName()+" 年龄："+one.getAge()+",学号："+one.getId()+" 教室："+one.room);

        Student two = new Student("郭靖",22);
        System.out.println("姓名："+two.getName()+" 年龄："+two.getAge()+",学号："+two.getId()+" 教室："+two.room);
    }

}
