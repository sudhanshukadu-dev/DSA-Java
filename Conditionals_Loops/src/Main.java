import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "mango":
                System.out.println("King of fruits!");
                break;
            case "apple":
                System.out.println("Sweet red fruit.");
                break;
            case "grapes":
                System.out.println("Small fruit.");
                break;
            default:
                System.out.println("Enter a valid fruit!!");

        }

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits!");
//            case "apple" -> System.out.println("Sweet red fruit.");
//            case "grapes" -> System.out.println("Small fruit.");
//            default -> System.out.println("Enter a valid fruit!!");
//        }
    }
}
