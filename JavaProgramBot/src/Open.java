import java.io.File;
import java.io.IOException;

public class Open {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pc = new ProcessBuilder("notepad.exe", "harsh.java");
        pc.directory(new File("C:\\"));
        pc.start();
    }
}
