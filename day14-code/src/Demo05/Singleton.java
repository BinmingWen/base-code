package Demo05;

//单例类
public class Singleton {
    private static Singleton instance;
    //使用private修饰构造方法，用户隐藏构造类
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
