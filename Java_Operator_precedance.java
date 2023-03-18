public class Java_Operator_precedance {
    public static void main(String[] args) {
        System.out.println("Precedance in java..");
        int a = 5*6-32/2;
        /*
        highest precedence goes to * & /. They are then evaluated on the basis of left to right associativity.
        * => 30-32/2
        * => 30-17
        * => 13
        */
        int b = 60/5-32*2;
        /*
         * => 30-32/2
         * => 30-17
         * => 13
         */
        System.out.println(a);
        System.out.println(b);

        // precedence & associativity

        // Quick Quiz
        int x = 6;
        int y = 1;
        int c = 3;
//        int k = x*y/2; for question one
        int k = (b*b - 4*a*c) / (2*a); // for question two, here if do not use parenthesis then the value come different parenthesis are require to solve this correctly.
        System.out.println(k);
    }
}
