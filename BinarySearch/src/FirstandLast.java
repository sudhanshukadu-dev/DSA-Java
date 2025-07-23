import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 8};
        int target = 5;
        System.out.println(Arrays.toString(firstandlast(nums, target)));

    }
    static int[] firstandlast(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
       return ans;
    }
    static int search(int[] arr, int target, boolean SearchforFirstOccurance){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (SearchforFirstOccurance) {
                   end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            if (arr[mid] > target){
                end = mid - 1;
            }
            if (arr[mid] < target){
                start = mid + 1;
            }
        }
        return ans;
    }

}
