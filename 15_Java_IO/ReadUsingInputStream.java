import java.io.FileInputStream;
import java.io.IOException;

public class ReadUsingInputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("sample.txt");
        int data;

        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }

        fis.close();
    }
}
