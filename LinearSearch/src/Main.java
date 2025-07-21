public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 33, 556, 78, 90};
        int target = 556;

        System.out.println(linerSearch(arr, target));
        System.out.println(linerSearch2(arr, target));
        System.out.println(linerSearch3(arr, target));

    }

    //Return Boolean
    static boolean linerSearch3(int[] array, int target){
        if (array.length == 0){
            return false;
        }
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    //Return Value
    static int linerSearch2(int[] array, int target){
        if (array.length == 0){
            return -1;
        }
        for (int element : array) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    //Return Index
    static int linerSearch(int[] array, int target){
        if (array.length == 0){
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}