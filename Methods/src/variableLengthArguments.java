import java.util.Arrays;

public class variableLengthArguments {
    public static void main(String[] args) {
        printFun(1,2,3,4,5,67,77);
    }
    static void printFun(int ...v){
        System.out.println(Arrays.toString(v));;
    }
}
