package cn.wyu.RawType;

public class Apple<T extends Number> {
    T size;
    public Apple(){}

    public Apple(T size) {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }
    public T getSize(){
        return this.size;
    }
}
