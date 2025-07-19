import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conditionals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        int Salary = input.nextInt();

        if (Salary > 10_000 && Salary < 20_000) {
           Salary += 1000;
        } else if (Salary > 20_000) {
            Salary += 3000;
        }else {
            Salary += 500;
        }

        System.out.println("New Salary: " + Salary);
    }
}