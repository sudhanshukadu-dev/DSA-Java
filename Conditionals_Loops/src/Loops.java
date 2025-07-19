import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        // For Loop
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // While Loop
        int i = 1;
        while (i <= num){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // do While

        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        }while (j <= num);

    }
}
