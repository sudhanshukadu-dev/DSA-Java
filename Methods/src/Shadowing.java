public class Shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 80;
        System.out.println(x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
