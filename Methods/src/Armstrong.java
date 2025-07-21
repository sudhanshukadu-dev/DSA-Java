public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            printArm(i);
        }
    }
    static void printArm(int n){
        int original = n;
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            ans = ans + (rem * rem * rem);
            n /= 10;
        }
        if (ans == original) {
            System.out.print(original + " ");
        }
    }
}
