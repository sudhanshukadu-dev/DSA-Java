import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 3, 4, 66, 7, 78},
                {56, 778, 99, 0},
                {34, 555, 677, 888, 999}
        };

        int target = 56;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }

    static int max(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }


    static int[] search(int[][] array, int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
