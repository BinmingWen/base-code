package cn.wyu;

public class Apple<T> {
    private T info;
    public Apple(){}

    public Apple(T info) {
        this.info = info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }


}
