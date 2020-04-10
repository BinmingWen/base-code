package Sort;

public class QuickSort {
    public static void swap(int data[], int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void sortInfo(int data[], int start, int end) {
        if (start < end) {
            int key = data[start];
            int i = start;
            int j = end;
            while (true) {
                while (i < j && data[++i] < key);
                while (i < j && data[--j] > key);
                if(i<j) {
                    swap(data, i, j);
                }else{
                    break;
                }
            }
            //确定下一个key的值
            swap(data, start, j);
            //左边扫描
            sortInfo(data, start, j - 1);
            //右边扫描
            sortInfo(data,j+1,end);

        }
    }
    public static void main(String[] args) {

    }
}
