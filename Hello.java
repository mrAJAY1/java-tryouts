import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");

        int num1;
        String name;
        System.out.println("Enter the number");
        num1 = sc.nextInt();
        sc.nextLine();  // Clear the newline character from the input buffer
        System.out.println("Enter the name");
        name = sc.nextLine();
        Display di = new Display();
        di.display(num1, name);
    }
}