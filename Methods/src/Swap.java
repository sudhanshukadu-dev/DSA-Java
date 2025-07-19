public class Swap {
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        System.out.println(a + " " + b);
        swapNum();
        System.out.println(a + " " + b);
    }

    static void swapNum() {
        int temp = a;
        a = b;
        b = temp;
    }
}
