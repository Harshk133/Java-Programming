import java.util.Scanner;

public class Java_Getting_Input_from_user{
    public static void main(String[] args) {
        System.out.println("Getting Input from user");

        Scanner io = new Scanner(System.in);
//        System.out.println("Enter the First Number: ");
////        int a = io.nextInt();
//        float a = io.nextFloat();
//        System.out.println("Enter the Second Number: ");
////        int b = io.nextInt();
//        float b = io.nextFloat();
//        float sum = a + b;
//        boolean b1 = io.hasNextInt();
//        System.out.print("The Sum of these numbers is: ");
//        System.out.println(sum);
//        System.out.println(b1);

//        String str = io.next();
        String str = io.nextLine();
        System.out.println(str);

    }
}
