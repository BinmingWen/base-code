package Demo05;

import java.util.Arrays;

public class FinalRerenceTest {
    public static void main(String[] args) {
        final int [] iArr = {5,6,12,9};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        //iArr = null;

        final Person p = new Person(22);
        p.setAge(33);
        //p = null;
    }
}
