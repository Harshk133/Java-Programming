import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        //String text = "Write Program for addition";
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String word = "";
        text += " ";
        System.out.println(text);

        int count = 0;
        int ler=text.length();
        System.out.println(ler);
        for(int i=0; i<text.length(); i++){

            char ch = text.charAt(i);
if(ch == ' '){
    word+=" ";
}


            if (ch != ' ') {
//                System .out.println(ch);

                word += ch;//"s"
                System.out.println(word);

            }
            else{

                if (
                    word.equalsIgnoreCase("a")||
                    word.equalsIgnoreCase("program")||
                    word.equalsIgnoreCase("addition")||
                    word.equalsIgnoreCase("Write")){
                    System.out.println(" " +word);
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
