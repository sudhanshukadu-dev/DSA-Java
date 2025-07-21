public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 56, 77, 99, 6, 7, 0, -45};
        System.out.println(min(arr));
    }

    static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}
