package demo01;

public class demo07StringPractice {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        String str = fromArrayToString(array);
        System.out.println(str);
    }
    public static String fromArrayToString(int[] array){
        String str= "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="world"+array[i]+"]";
            }
            else{
                str+="world"+array[i]+"#";
            }

        }
        return str;
    }
}
