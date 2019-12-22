package cn.wyu.Variable;

public class Person {
    String name;    //姓名
    private int age;   //年龄
    public void setAge(int age) {
        if(age < 0) {
            System.out.println("数据不合理");
        }else{
            this.age = age;
        }

    }
    public int getAge(){
        return age;
    }
    public void show() {
        System.out.println("姓名："+name+" 年龄："+age);
    }
}
