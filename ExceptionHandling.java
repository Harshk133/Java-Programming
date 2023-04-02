//import java.util.Scanner;
//
//class ExceptionMsg extends Exception{
//    ExceptionMsg(String s){
//        super(s);
//    }
//}
//
//public class ExceptionHandling {
//    public static void main(String[] args) throws ExceptionMsg {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter YOur Age: ");
//        int age = s.nextInt();
//        if(age<0){
//            throw new ExceptionMsg("Age cannot be negative!!");
//        }
//    }
//}

//import java.io.Console;
//import java.util.Scanner;
//
//class PassWordException extends Exception{
//    PassWordException(String s){
//        super(s);
//    }
//
//    public static void main(String[] args) throws PassWordException {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the Password: ");
//        Console console = System.console();
//        char[] password = System.console().readPassword();
//        System.out.println("Confirm Password: ");
//        char[] confirmPass = System.console().readPassword();
//        if(password.toString() != confirmPass.toString()){
//            throw new PassWordException("Password is Incorrect :(\nPlease Try Again!");
//        }
//        else{
//            System.out.println("Thank You User!!");
//        }
//    }
//}
//
//public class ExceptionHandling {
//    public static void main(String[] args) throws PassWordException {
//        System.out.println("present");
//    }
//}

//import java.util.Scanner;
//class StringMismatchException extends Exception{
//    StringMismatchException(String s){
//        super(s);
//    }
//}
//public class ExceptionHandling {
//    public static void main(String[] args) throws StringMismatchException {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the First String: ");
//        String s1 = s.nextLine();
//        System.out.println("Enter the Second String: ");
//        String s2 = s.nextLine();
//        if (!s1.contentEquals(s2)){
//            throw new StringMismatchException("String is Mismatched!");
//        }
//        else{
//            System.out.println("YOu enetered the Same String");
//        }
//    }
//}

import java.util.Scanner;
class StringNotEqual extends Exception{
    StringNotEqual(String s){
        super(s);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) throws StringNotEqual{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String which is equal to MSBTE");
        String str = s.nextLine();
        if (!str.contains("msbte")){
            throw new StringNotEqual("String is not equal to MSBTE or msbte!!");
        }
        else{
            System.out.println("Thank you for entering you MSBTE!!");
        }
    }
}







