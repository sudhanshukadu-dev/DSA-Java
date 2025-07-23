public class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 1};
        int target = 5;
        System.out.println(find(nums, target));

    }
    static int find(int[] arr, int target){
        int ans = -1;
        if (arr[peak(arr)] == target) {
            ans = peak(arr);
        }
        if (arr[peak(arr)] > target) {
            ans = binarySearch(arr, target, 0, peak(arr)-1);
            if (ans == -1){
                ans = binarySearch(arr, target, peak(arr) + 1, arr.length - 1);
            }
        }
        return ans;
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        // Order Check
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // The Change
            if (isAsc) {
                if (arr[mid] > target){
                    end = mid - 1;
                }
                if (arr[mid] < target){
                    start = mid + 1;
                }
            }else {
                if (arr[mid] > target){
                    start = mid + 1;
                }
                if (arr[mid] < target){
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
