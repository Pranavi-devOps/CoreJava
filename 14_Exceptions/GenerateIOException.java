import java.io.*;

public class GenerateIOException {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("abc.txt");
        file.read();
    }
}
