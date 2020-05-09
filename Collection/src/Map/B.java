package Map;

public class B {
    private int count;

    @Override
    public String toString() {
        return "B{" +
                "count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public B(int count) {
        this.count = count;
    }
}
