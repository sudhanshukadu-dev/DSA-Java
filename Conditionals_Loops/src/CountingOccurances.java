import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int num = 233456788;

        int Occurance = 0;
        while (num > 0){
            if (num % 10 == n){
                Occurance++;
            }
            num /= 10;
        }
        System.out.println(Occurance);
    }
}
