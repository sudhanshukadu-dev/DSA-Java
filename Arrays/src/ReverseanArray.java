import java.util.Arrays;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] array){
        int Start = 0;
        int End = array.length - 1;
        while (Start < End){
            int temp = array[Start];
            array[Start] = array[End];
            array[End] = temp;
            Start++;
            End--;
        }
    }
}
