import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");

        int number, num1, num2, choice;
        String name;
        System.out.println("Enter the number");
        number = sc.nextInt();
        sc.nextLine(); // Clear the newline character from the input buffer
        System.out.println("Enter the name");
        name = sc.nextLine();
        Display di = new Display();
        di.display(number, name);
        System.out.println("Next, choose an option: 1 - sum, 2 - difference");
        choice = sc.nextInt();
        System.out.println("Enter the numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        Calculation calc = new Calculation();
        switch (choice) {
            case 1: {
                calc.sum(num1, num2);
                break;
            }
            case 2: {
                calc.difference(num1, num2);
                break;
            }
            default: {
                System.out.println("Invalid selection");
            }
        }
    }
}