package Set;

import java.util.Objects;

public class M implements Comparable{
    int age;

    public M(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "M{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        /*M m = (M)o;
        return age>m.age?-1:age<m.age?1:0;*/
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
