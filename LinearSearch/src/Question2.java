public class Question2 {
    public static void main(String[] args) {
        int[][] accounts = {
        {1,2,3},
        {3, 2, 1}
        };
        System.out.println(max(accounts));
    }
    static int max(int[][] arr){
        int max = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
