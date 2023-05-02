import java.util.Scanner;

public class harsh {
    public static void main(String[] args) {


        //String text = "Write Program for addition";
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);

        String word = "";
        text += " ";
        int count = 0;
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);

            if (ch != '$') {
                word += ch;
            }
            else{
                if (
//                word.toCharArray();
                        word.equalsIgnoreCase("a")||
                                word.equalsIgnoreCase("program")||
                                word.equalsIgnoreCase("addition")||
                                word.equalsIgnoreCase("Write")){
                    System.out.println(word);
                    count++;
                    word="";
                }
            }
        }
        if (count==0){
            System.out.println("Word not present");
        }
        else{
            System.out.println("Word is present");
        }
    }
}
