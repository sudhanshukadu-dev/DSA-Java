public class SearchInInfinite {
    public static void main(String[] args) {

        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12
        };
        int target = 6;
        System.out.println(search(numbers, target));

    }
    static int search(int[] array, int target){
        int start = 0;
        int end = 1;
        while (array[end] < target){
                int temp = end + 1;
                end = end + (end - start + 1) * 2;
                start = temp;
        }
        return binarySearch(array, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target){
                end = mid - 1;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
}
