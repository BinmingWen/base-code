package Demo01MethodRef;

@FunctionalInterface
public interface Printable<T> {
    void print(T t);
}
