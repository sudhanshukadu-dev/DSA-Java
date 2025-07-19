import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        int num = 12345677;
        int ans = 0;

        while(num > 0){
            ans = (ans * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(ans);
    }
}
