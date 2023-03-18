import java.io.*;

public class java_practical_test {
    public static void main(String[] args)
    throws IOException{
        ProcessBuilder pbld1 = new ProcessBuilder("notepad.exe", "hello_world.java");
        pbld1.start();
    }
}
