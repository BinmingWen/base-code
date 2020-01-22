package cn.wyu.Lambda;

public class LambdaQs {
    //调用方法使用Eatable对象
    public void eat(Eatable eatable) {
        System.out.println(eatable);
        eatable.taste();
    }
    //调用方法需要Flyable对象
    public void drive(Flyable f) {
        System.out.println("我在驾驶：" + f);
        f.fly("【碧空如洗的晴天】");
    }
    //调用方法需要Addable对象
    public void test(Addable a) {
        System.out.println("5和3的和为："+a.add(5,3));
    }
}
