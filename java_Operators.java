public class java_Operators {
    public static void main(String[] args) {
        System.out.println("Operators in Java!");
        int a = 4;
//        int b = 6 + a;
        int b = 3;
//        b += 3;
        b *= 3;
        System.out.println(b);
//        System.out.println(b==a); this gives false. this is called comparision operator.

        // Logical Operators
        System.out.println(2>1 && 1>0); // Logical Operator and
        System.out.println(4>1 || 1<2); // Logical Operator or
        System.out.println(2&3);
//        bitwise operator works on single bits..
//        11
//        10
//        ---
//        10
    }
}
