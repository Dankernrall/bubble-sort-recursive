import java.util.Arrays;

public class BubbleSort {
static int[] bubbleSort(int[] arr, int length){
    boolean check = true;
    for (int i = 1; i < length;i++){
        if (arr[i] < arr[i - 1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            check = false;
        }
    }if (!check){bubbleSort(arr,length);}
    return arr;
}
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        arr = bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

