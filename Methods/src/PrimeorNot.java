import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int count = 2;
        while (count * count <= n){
            if (n % count == 0){
                return false;
            }
            count++;
        }
        return count * count > n;
    }
}
