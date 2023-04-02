import java.util.Scanner;
class Employee{
    Scanner in = new Scanner(System.in);
    int id;
    String name;
    public void getData(){
        System.out.println("Enter the Id: ");
        id = in.nextInt();
        System.out.println("Enter the Name: ");
        in.nextLine();
        name = in.nextLine();
    }

    public void printData(){
        System.out.println("My Id is: "+id);
        System.out.println("And my Name is: "+name);
    }
}

public class java_Custom_class {
    public static void main(String[] args) {
        System.out.println("The Custom Class.");
        Employee harsh = new Employee();
        //harsh.id = 3;
        //harsh.name = "Harsh";
        //System.out.println(harsh.id);
        //System.out.println(harsh.name);
        int i = 3;
        // this is working ...
//        for (i=0; i<=3; i++){
//            harsh.getData();
//        }

        // this is working but not performing as expected..
//        for (i=0; i<=3; i++){
//            harsh.printData();
//        }
        harsh.getData();
        harsh.printData();

    }
}
