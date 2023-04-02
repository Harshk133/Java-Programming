import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter Username: ");
        String unm=System.console().readLine();

        System.out.println("Enter Password: ");
        char[] pwd=System.console().readPassword();

        System.out.println("Welcome: " + "" + " Your password is " + new String(pwd));
    }
}
