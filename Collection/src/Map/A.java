package Map;

import java.util.Objects;

public class A implements Comparable{
    int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o != null && o.getClass() == A.class) {
            A a = (A)o;
            return this.count==a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
