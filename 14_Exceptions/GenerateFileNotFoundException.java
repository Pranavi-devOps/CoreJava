import java.io.*;

public class GenerateFileNotFoundException {

    public static void main(String[] args) throws Exception {

        try (FileInputStream file = new FileInputStream("abc.txt")) {
        }
    }
}