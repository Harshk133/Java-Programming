import java.util.*;


public class java_vector{
    public static void main(String[] args) {
        Vector list = new Vector();
        int length = args.length;
        for(int i=0; i<length; i++){
            list.addElement(args[i]);
        }
        list.insertElementAt("COBOL", 2);
        int size = list.size();
        String listarray[] = new String[size];
        list.copyInto(listarray);
        System.out.println("List of Languages");
        for(int i=0; i<size; i++){
            System.out.println(listarray[i]);
        }
    }
}