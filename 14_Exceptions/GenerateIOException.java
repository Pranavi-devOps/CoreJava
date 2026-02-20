import java.io.*;

public class GenerateIOException {

    public static void main(String[] args) throws IOException {

        try (FileReader file = new FileReader("abc.txt")) {
            file.read();
        }
    }
}