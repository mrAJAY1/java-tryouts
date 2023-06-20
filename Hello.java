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
        System.out.println("Next, choose an option: 1 - sum, 2 - difference, 3 - average");
        choice = sc.nextInt();

        Calculation calc = new Calculation();
        switch (choice) {
            case 1: {
                System.out.println("Enter the numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                calc.sum(num1, num2);
                break;
            }
            case 2: {
                System.out.println("Enter the numbers");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                calc.difference(num1, num2);
                break;
            }
            case 3: {

                int[] newArr = new int[100];
                System.out.println("Enter the total numbers");
                int totalNumber = sc.nextInt();
                newArr = new int[totalNumber];
                System.out.println("Enter the numbers");
                for (int i = 0; i < totalNumber; i++) {

                    newArr[i] = sc.nextInt();
                }
                System.out.println("The Average is: " +  calc.average(newArr));
                break;
            }
            default: {
                System.out.println("Invalid selection");
            }
        }
    }
}