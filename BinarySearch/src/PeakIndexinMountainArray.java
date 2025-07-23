public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4,6,9, 2, 1};
        System.out.println(peak(nums));

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
}
