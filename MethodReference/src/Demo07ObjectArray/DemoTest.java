package Demo07ObjectArray;

public class DemoTest {
    public static int[] createArray(int len, ArrayBuilder arrayBuilder) {
        return arrayBuilder.getArray(len);
    }
    public static void main(String[] args) {
        int[] arr = createArray(10,(i)->{
            return new int[i];
        });
        System.out.println(arr.length);

        int[] array = createArray(10, int[]::new);
        System.out.println(array.length);
    }
}
