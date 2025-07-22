public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {12, 45, 67, 89, 90, 100, 230};
        int target = 68;
        System.out.println(floor(nums, target));
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] > target){
                end = mid - 1;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return arr[end];
    }

}
