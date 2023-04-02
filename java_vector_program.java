import java.util.Vector;

public class java_vector_program {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        int length = args.length;
        for(int i=0; i<length; i++){
            list.addElement(args[i]);
        }
        list.insertElementAt("COBOL", 2);
        int size = list.size();
        String[] listArray = new String[size];
        list.copyInto(listArray);
        System.out.println("List of Languages");
        for(int i=0; i<size; i++){
            System.out.println(listArray[i]);
        }
    }
}
