package Demo02ObjectRef;

@FunctionalInterface
public interface Printable<T> {
    void print(T t);
}
