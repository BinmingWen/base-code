package Exception;

import java.util.Objects;

public class ObjectsRequireNonNull {
    public static void main(String[] args) {
        getObject(null);
    }

    private static void getObject(Object o) {
        /*if (o == null) {
            throw new NullPointerException("对象为空");
        }*/
        //Objects.requireNonNull(o);
        Objects.requireNonNull(o,"对象为空");
    }
}
