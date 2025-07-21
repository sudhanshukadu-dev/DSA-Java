public class Question1 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(counter(0));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counter(arr[i]) / 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int counter(int num){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
