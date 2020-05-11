package cn.wyu.upperBound;

public class Apple<T extends Number & java.io.Serializable> {
    T col;

    public static void main(String[] args) {
        Apple<Integer> a1 = new Apple<>();
        Apple<Double> a2 = new Apple<>();
      //  Apple<String> a3 = new Apple<>();
    }
}
