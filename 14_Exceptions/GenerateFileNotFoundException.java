import java.io.*;

public class GenerateFileNotFoundException {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream file = new FileInputStream("abc.txt");
    }
}
