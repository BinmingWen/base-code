package cn.wyu.InferType;

public class InferenceTest {
    public static void main(String[] args) {
        MyUtil<String> ls = MyUtil.nil();
        MyUtil<String> mu= MyUtil.<String>nil();
        MyUtil.cons(43, MyUtil.nil());
        MyUtil.cons(2, MyUtil.<Integer>nil());
    }
}
