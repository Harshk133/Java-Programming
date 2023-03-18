import java.util.Scanner;

public class java_practice_set_two {
    public static void main(String[] args) {
        //float a = 7/4 * 9/2;
        //float a = 7/4.0f * 9/2.0f; // this gives => 7.875
        //System.out.println(a);

        //char grade = 'B';
        //grade = (char)(grade + 8);
        //grade += 8; This can be run but gives diffn result.
        //System.out.println(grade);

        // Decrypting the grade..
        // grade = (char)(grade - 8);
        // grade += 8; This can be run but gives diffn result.
        //System.out.println(grade);

        Scanner io = new Scanner(System.in);
        int a;
        a = io.nextInt();
        System.out.println(a>8);

    }
}
