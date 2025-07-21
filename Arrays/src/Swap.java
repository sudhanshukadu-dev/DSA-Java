import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 56, 67, 8, 77};
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
