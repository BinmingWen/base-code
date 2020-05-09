package Map;

public class R implements Comparable{
    private int count;
    public R(int count){
        this.count = count;
    }

    @Override
    public String toString() {
        return "R{" +
                "count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        R o1 = (R) o;
        return count>o1.getCount()?1:count<o1.getCount()?-1:0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == this.getClass()) {
            R r = (R) object;
            return r.count==((R) object).count;
        }
        return false;
    }
}
