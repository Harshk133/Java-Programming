import java.util.Scanner;

public class hello_world {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("Welcome to Harsh's Calculator!");
        System.out.println("1.Addition!");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        // Declaration of Variables
        int a, b, c;
        int option;

        // Taking Input from User.
        Scanner io = new Scanner(System.in);


        System.out.print("Enter the option: ");
        option = io.nextInt();

        System.out.print("Enter the First Number: ");
        a = io.nextInt();

        System.out.print("Enter the Second Number: ");
        b = io.nextInt();

            switch (option) {
                case 1 -> System.out.println("The Result Of Addition is " + (a + b));
                case 2 -> System.out.println("The Result Of Substraction is " + (a - b));
                case 3 -> System.out.println("The Result Of Multiplication is " + (a * b));
                case 4 -> System.out.println("The Result Of Division is " + (a / b));
                default -> System.out.println("Invalid Choice!!");
            }


    }
}
