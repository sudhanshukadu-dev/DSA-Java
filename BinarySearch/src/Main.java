public class Main {
    public static void main(String[] args) {

        int[] nums = {23, 55, 67, 89, 90, 556, 7778, 8899};
        int target = 90;
        System.out.println(binarySearch(nums, target));

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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