import java.util.Scanner;

public class java_Introduction_to_String {
    public static void main(String[] args) {
        System.out.println("Introduction to String!");
        // String name = new String("My Name is Harsh Kale.");
        // String name = "harsh";
//        String newString = new String("Hello this is the new string.");
//        System.out.println(newString);
        // System.out.println(name);
//        int a = 6;
//        float b = 8.8f;
//        System.out.printf("the value of a is %d and value of b is %f is", a, b);
//        System.out.println(); Adds the new line
//        System.out.print(); Doesn't add the new line
//        System.out.printf(); c, c++ format used by printf()
//        System.out.format(); Same as the printf statement
        //int a = 4;
        //int b = 5;
        //System.out.printf("The Values of a and b are: %d and %d", a, b);
        //System.out.format("The Values of a and b are: %d and %d", a, b);
        Scanner io = new Scanner(System.in);
        //String str = io.next();
        String str = io.nextLine();
        System.out.println(str);
    }
}
