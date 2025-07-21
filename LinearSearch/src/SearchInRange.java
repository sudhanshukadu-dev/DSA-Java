public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {34, 56, 78, 8, 90, 87};
        int target = 8;
        System.out.println(search(arr,4, 4, 8));

    }

    static int search(int[] array, int index1, int index2, int target){
        for (int i = index1; i <= index2; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
