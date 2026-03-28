public class Question1 {
    static void main() {
        int[] arr = {22,3,2,1,0,-1,-2};
        int target = -1;
        int ans = orderAgno(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    static int orderAgno(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAcending = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            };

            if (isAcending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid - 1;
                }

            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
            };


        }

        return -1;
    }
}
