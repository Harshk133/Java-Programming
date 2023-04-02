import java.io.IOException;
import java.util.Random;

public class ProgressAnimation {
//    public static void main(String[] args) throws InterruptedException, IOException {
//        String anim= "|/-\\";
//        for (int x =0 ; x < 100 ; x++) {
//            // String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
//            //System.out.println("hii");
//            String data = "harsh kale";
//            System.out.write(data.getBytes());
//            Thread.sleep(100);
//        }
//    }
public static void main(String[] args) throws InterruptedException {
    Random rand = new Random();
    String strArr[] = {"hello", "hii", "there", "I", "am", "Programmer"};
    int n = rand.nextInt(3);
    //n += 1;
    System.out.println(strArr[n+3] + " " + strArr[n+1] + " " + strArr[n+2]);
   //String text = "hello world!!";
//    for (int i = 0; i < text.length(); i++) {
//        System.out.print(text.charAt(i));
//        Thread.sleep(10);
//    }
}
}