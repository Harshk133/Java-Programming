
//class PrgoramSet{
//
//    public void AdditionProgram{
//        String txt = "import java.util.Scanner;\n" +
//                "\n" +
//                "public class Program{\n" +
//                " public static void main(String[] args){\n" +
//                "  Scanner in = new Scanner(System.in);\n" +
//                "  System.out.println(\"Enter the First Number: \");\n" +
//                "  int a = in.nextInt();\n" +
//                "\n" +
//                "  System.out.println(\"Enter the Second Number: \");\n" +
//                "  int b = in.nextInt();\n" +
//                "  \n" +
//                "  System.out.println(\"The Additon is \" + (a+b));\n" +
//                " }\n" +
//                "}";
//
//    }
//}
public class Hello_World {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("hello world!");
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
            System.out.println(text.charAt(i));
            Thread.sleep(100);
        }
    }
}
