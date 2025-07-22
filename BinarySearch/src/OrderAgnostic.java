public class OrderAgnostic {
    public static void main(String[] args) {
        int[] nums = {9, 12, 14, 16, 17, 34};
        int target = 14;
        System.out.println(orderAgnostic(nums, target));

    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
