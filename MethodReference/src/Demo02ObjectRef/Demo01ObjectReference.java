package Demo02ObjectRef;

public class Demo01ObjectReference {
    public static void print(Printable<String> printable) {
        printable.print("hello");
    }
    public static void main(String[] args) {
        print((s)->{
            ObjectRef or = new ObjectRef();
            or.toUpperCaseString(s);
            //System.out.println(s);
        });
        ObjectRef obj = new ObjectRef();
        print(obj::toUpperCaseString);

    }
}
