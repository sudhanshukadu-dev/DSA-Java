import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 66, 7, 8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] array) {
        array[0] = 9;
    }
}
