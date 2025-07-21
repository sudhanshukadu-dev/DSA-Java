import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(5);

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //Output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println(list);
    }
}
