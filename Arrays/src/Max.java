public class Max {
    public static void main(String[] args) {
        int[] arr = {2, 44, 5, 666, 7, 888, 90};
        System.out.println(max(arr) + " at index " + max1(arr));
        System.out.println(maxRange(arr, 0, 3));
    }

    //Max Value
    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Max Value Index
    static int max1(int[] array) {
        int max = array[0];
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                ans = i;
            }
        }
        return ans;
    }

    //Max in Range
    static int maxRange(int[] array , int index1, int index2) {
        int max = array[index1];
        for (int i = index1; i <= index2; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
