import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.net.ServerSocket;

class ProgramSet extends Thread{
    public void AdditionProgram() throws InterruptedException {
        String text = "import java.util.Scanner;\n" +
                "\n" +
                "public class Program{\n" +
                " public static void main(String[] args){\n" +
                "  Scanner in = new Scanner(System.in);\n" +
                "  System.out.println(\"Enter the First Number: \");\n" +
                "  int a = in.nextInt();\n" +
                "\n" +
                "  System.out.println(\"Enter the Second Number: \");\n" +
                "  int b = in.nextInt();\n" +
                "  \n" +
                "  System.out.println(\"The Additon is \" + (a+b));\n" +
                " }\n" +
                "}";
        for (int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }

    public void SubstractionProgram() throws InterruptedException{
        String text = "import java.util.Scanner;\n" +
                "\n" +
                "public static Program{\n" +
                " public static void main(String[] args){\n" +
                "  Scanner in = new Scanner(System.in);\n" +
                "  System.out.println(\"Enter the First Number: \");\n" +
                "  int a = in.nextInt();\n" +
                "  \n" +
                "  System.out.println(\"Enter the Second Number: \");\n" +
                "  int b = in.nextInt();\n" +
                "\n" +
                "  System.out.println(\"The Substraction is \" + (a-b));\n" +
                " }\n" +
                "}";
        for (int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }

    public void MultiplicationProgram() throws InterruptedException{
        String text = "import java.util.Scanner;\n" +
                "\n" +
                "public static Program{\n" +
                " public static void main(String[] args){\n" +
                "  Scanner in = new Scanner(System.in);\n" +
                "  System.out.println(\"Enter the First Number: \");\n" +
                "  int a = in.nextInt();\n" +
                "  \n" +
                "  System.out.println(\"Enter the Second Number: \");\n" +
                "  int b = in.nextInt();\n" +
                "\n" +
                "  System.out.println(\"The Multiplication is \" + (a*b));\n" +
                " }\n" +
                "}";
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }

    public void DivisionProgram() throws InterruptedException{
        String text = "import java.util.Scanner;\n" +
                "\n" +
                "public static Program{\n" +
                " public static void main(String[] args){\n" +
                "  Scanner in = new Scanner(System.in);\n" +
                "  System.out.println(\"Enter the First Number: \");\n" +
                "  int a = in.nextInt();\n" +
                "  \n" +
                "  System.out.println(\"Enter the Second Number: \");\n" +
                "  int b = in.nextInt();\n" +
                "\n" +
                "  System.out.println(\"The Division is \" + (a/b));\n" +
                " }\n" +
                "}";
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }

    public void FabinocciSerriesProgram() throws InterruptedException{
        String text = "import java.util.Scanner;\n" +
                "\n" +
                "public class Program{\n" +
                " public static void main(String[] args){\n" +
                "  Scanner in = new Scanner(System.in);\n" +
                "  \n" +
                "  System.out.println(\"Enter the Number: \");\n" +
                "  int n = in.nextInt();\n" +
                "  \n" +
                "  int f1, f2=0, f3=1;\n" +
                "  for(int i=0; i<num; i++){\n" +
                "   System.out.println(\" \"+f3+\" \");\n" +
                "   f1=f2;\n" +
                "   f2=f3;\n" +
                "   f3=f1+f2;\n" +
                "  }\n" +
                " }\n" +
                "}";
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }

    public void changeSourceCode() throws InterruptedException{
        String text = "import java.util.Scanner;\n" +
                "import java.util.Random;\n" +
                "\n" +
                "class Robot extends Thread{\n" +
                "    public void startChating() throws InterruptedException{\n" +
                "        Scanner in = new Scanner(System.in);\n" +
                "        String userInput = in.nextLine();\n" +
                "        ProgramSet p = new ProgramSet();\n" +
                "        if (userInput.contains(\"Addition Program\")){\n" +
                "            p.AdditionProgram();\n" +
                "        }\n" +
                "        else if(userInput.contains(\"Substraction Program\")){\n" +
                "            p.SubstractionProgram();\n" +
                "        }\n" +
                "        else if(userInput.contains(\"Multiplication Program\")){\n" +
                "            p.MultiplicationProgram();\n" +
                "        }\n" +
                "        else if(userInput.contains(\"Division Program\")){\n" +
                "            p.DivisionProgram();\n" +
                "        }else if(userInput.contains(\"Fabinocci Series Program\")){\n" +
                "            p.FabinocciSerriesProgram();\n" +
                "        }\n" +
                "        else{\n" +
                "            String computerResponse[] = {\n" +
                "                    \"I don't Know Master!!\",\n" +
                "                    \"\uD83D\uDE14\uD83D\uDE14\uD83D\uDE14\",\n" +
                "                    \"I don't know about \"+userInput,\n" +
                "                    \"Does not understandable!!\\nDo it mannually!\",\n" +
                "                    \"Give me Some Other Task\",\n" +
                "                    \"I con't Do this!!\uD83D\uDE2D\",\n" +
                "                    \"I am a open source bot please change my source code to run as per your wish\"\n" +
                "            };\n" +
                "            int limit = computerResponse.length;\n" +
                "            Random randomNumber = new Random();\n" +
                "            int n = randomNumber.nextInt(limit);\n" +
                "            System.out.println(computerResponse[n]);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "class ProgramSet extends Thread{\n" +
                "\n" +
                "    public void AdditionProgram() throws InterruptedException {\n" +
                "        String text = \"import java.util.Scanner;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public class Program{\\n\" +\n" +
                "                \" public static void main(String[] args){\\n\" +\n" +
                "                \"  Scanner in = new Scanner(System.in);\\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the First Number: \\\");\\n\" +\n" +
                "                \"  int a = in.nextInt();\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the Second Number: \\\");\\n\" +\n" +
                "                \"  int b = in.nextInt();\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  System.out.println(\\\"The Additon is \\\" + (a+b));\\n\" +\n" +
                "                \" }\\n\" +\n" +
                "                \"}\";\n" +
                "        for (int i=0; i<text.length(); i++){\n" +
                "            System.out.print(text.charAt(i));\n" +
                "            Thread.sleep(10);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public void SubstractionProgram() throws InterruptedException{\n" +
                "        String text = \"import java.util.Scanner;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public static Program{\\n\" +\n" +
                "                \" public static void main(String[] args){\\n\" +\n" +
                "                \"  Scanner in = new Scanner(System.in);\\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the First Number: \\\");\\n\" +\n" +
                "                \"  int a = in.nextInt();\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the Second Number: \\\");\\n\" +\n" +
                "                \"  int b = in.nextInt();\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"  System.out.println(\\\"The Substraction is \\\" + (a-b));\\n\" +\n" +
                "                \" }\\n\" +\n" +
                "                \"}\";\n" +
                "        for (int i=0; i<text.length(); i++){\n" +
                "            System.out.print(text.charAt(i));\n" +
                "            Thread.sleep(10);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public void MultiplicationProgram() throws InterruptedException{\n" +
                "        String text = \"import java.util.Scanner;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public static Program{\\n\" +\n" +
                "                \" public static void main(String[] args){\\n\" +\n" +
                "                \"  Scanner in = new Scanner(System.in);\\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the First Number: \\\");\\n\" +\n" +
                "                \"  int a = in.nextInt();\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the Second Number: \\\");\\n\" +\n" +
                "                \"  int b = in.nextInt();\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"  System.out.println(\\\"The Multiplication is \\\" + (a*b));\\n\" +\n" +
                "                \" }\\n\" +\n" +
                "                \"}\";\n" +
                "        for(int i=0; i<text.length(); i++){\n" +
                "            System.out.print(text.charAt(i));\n" +
                "            Thread.sleep(10);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public void DivisionProgram() throws InterruptedException{\n" +
                "        String text = \"import java.util.Scanner;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public static Program{\\n\" +\n" +
                "                \" public static void main(String[] args){\\n\" +\n" +
                "                \"  Scanner in = new Scanner(System.in);\\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the First Number: \\\");\\n\" +\n" +
                "                \"  int a = in.nextInt();\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the Second Number: \\\");\\n\" +\n" +
                "                \"  int b = in.nextInt();\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"  System.out.println(\\\"The Division is \\\" + (a/b));\\n\" +\n" +
                "                \" }\\n\" +\n" +
                "                \"}\";\n" +
                "        for(int i=0; i<text.length(); i++){\n" +
                "            System.out.print(text.charAt(i));\n" +
                "            Thread.sleep(10);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public void FabinocciSerriesProgram() throws InterruptedException{\n" +
                "        String text = \"import java.util.Scanner;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public class Program{\\n\" +\n" +
                "                \" public static void main(String[] args){\\n\" +\n" +
                "                \"  Scanner in = new Scanner(System.in);\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  System.out.println(\\\"Enter the Number: \\\");\\n\" +\n" +
                "                \"  int n = in.nextInt();\\n\" +\n" +
                "                \"  \\n\" +\n" +
                "                \"  int f1, f2=0, f3=1;\\n\" +\n" +
                "                \"  for(int i=0; i<num; i++){\\n\" +\n" +
                "                \"   System.out.println(\\\" \\\"+f3+\\\" \\\");\\n\" +\n" +
                "                \"   f1=f2;\\n\" +\n" +
                "                \"   f2=f3;\\n\" +\n" +
                "                \"   f3=f1+f2;\\n\" +\n" +
                "                \"  }\\n\" +\n" +
                "                \" }\\n\" +\n" +
                "                \"}\";\n" +
                "        for(int i=0; i<text.length(); i++){\n" +
                "            System.out.print(text.charAt(i));\n" +
                "            Thread.sleep(10);\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class Bot {\n" +
                "    public static void main(String[] args) throws InterruptedException {\n" +
                "        System.out.println(\"Java Bot v0.1.1\uD83D\uDD25\");\n" +
                "        Robot robo = new Robot();\n" +
                "        int c = 0;\n" +
                "        while(1<2){\n" +
                "            robo.startChating();\n" +
                "            c++;\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }
    }
}

class RoboSpeaks{
    public void answer() throws InterruptedException {
        String text = "Computer get cold..\n"+
                "because Window is open!🤣🤣😂\n";
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            Thread.sleep(10);
        }

    }
    public int say(int num) throws InterruptedException{
        if(num == 1){
            answer();
        }
        return 0;
    }
}

class Robot extends Thread{
    public void startChating() throws InterruptedException{
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        ProgramSet p = new ProgramSet();
        String word = "";
        userInput += " ";
        int count = 0;
        for(int i=0; i<userInput.length(); i++){
            char ch = userInput.charAt(i);
            if (ch != ' ') {
                word += ch;
            }
            else{
                if (word.equalsIgnoreCase("a")||
                                word.equalsIgnoreCase("program")||
                        word.equalsIgnoreCase("two")||
                        word.equalsIgnoreCase("number")||
                        word.equalsIgnoreCase("numbers")||
                        word.equalsIgnoreCase("design")||word.equalsIgnoreCase("division")||
                                word.equalsIgnoreCase("Write")){
                    word="";
                    count=1;
                }
              else if (word.equalsIgnoreCase("substraction")||word.equalsIgnoreCase("sub")||word.equalsIgnoreCase("difference")){
                    word="";
                    count=2;
                }
              else if (word.equalsIgnoreCase("Addition")||word.equalsIgnoreCase("add")||word.equalsIgnoreCase("sum")||word.equalsIgnoreCase("adds")){
                    word="";
                    count=3;
                }else if (
                        word.equalsIgnoreCase("multiplication")||word.equalsIgnoreCase("multiply")||word.equalsIgnoreCase("product")){
                    word="";
                    count=4;
                }else if (word.equalsIgnoreCase("fabinocci")){
                    word="";
                    count=5;
                }
                word="";
            }
        }
        if (count==1){
            p.DivisionProgram();
        }
        else if (count==2){
            p.SubstractionProgram();
        }
        else if (count==3){

            p.AdditionProgram();
        }
        else if (count==4){
            p.MultiplicationProgram();
        }
        else if (count==5){
            p.FabinocciSerriesProgram();
        }
//        else{
//            System.out.println("Word is present");
//        }
//        if (userInput.contains("Addition Program")){
//            p.AdditionProgram();
//        }
//        else if(userInput.contains("Substraction Program")){
//            p.SubstractionProgram();
//        }
//        else if(userInput.contains("Multiplication Program")){
//            p.MultiplicationProgram();
//        }
//        else if(userInput.contains("Division Program")){
//            p.DivisionProgram();
//        }else if(userInput.contains("Fabinocci Series Program")){
//            p.FabinocciSerriesProgram();
//        }else if(userInput.contains("Edit Source Code")){
//            p.changeSourceCode();
//        }
        else{
            RoboSpeaks rs = new RoboSpeaks();
            String computerResponse[] = new String[]{
                    "I don't Know Master!!",
                    "😔😔😔",
                    "I don't know about " + userInput,
                    "Does not understandable!!\nDo it mannually!",
                    "Give me Some Other Task",
                    "I con't Do this!!😭",
                    "I am a open source bot please change my source code to run as per your wish",
                    "404",
                    "Searching on Google for " + "`" + userInput + "`",
                    // "Can I say you a Joke: (press 1/0)"+(rs.say(1)),
                    "Can I say you a Joke: ",
                    "Idk"
            };
            int limit = computerResponse.length;
            Random randomNumber = new Random();
            int n = randomNumber.nextInt(limit);
            System.out.println(computerResponse[n]);
        }
    }
}

class CheckforWord extends Robot{
    Scanner i = new Scanner(System.in);
    public void chechForword(){
        String str = i.nextLine();
        String word = "";
        str = str + " ";
        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                word = word + ch;
            }else{
                count++;
                word="";
            }
        }
        if(count==0){
            System.out.println("word not present!!");
        }
        else{
            System.out.println("Word is present");
        }
    }

}



public class Bot{
    public static void main(String[] x) throws InterruptedException {
         System.out.println("Java Bot v0.1.1🔥");
         System.out.print("Please Enter Your Name: ");
         Scanner in = new Scanner(System.in);
         String userName = in.nextLine();
          final String TEXT_PURPLE = "\u001B[35m";
          final String TEXT_CYAN = "\u001B[36m";
          final String TEXT_YELLOW = "\u001B[33m";
        System.out.print(TEXT_PURPLE + "hello ");
        System.out.print(TEXT_CYAN+ userName);
        System.out.println(TEXT_YELLOW+  " to Java Bot v0.1.1");
        Robot robo = new Robot();
        int c = 0;
        while(1<2){
            robo.startChating();
            System.out.println();
            c++;
        }
    }
}