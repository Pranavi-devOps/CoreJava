import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("sample.txt");
        String text = "Hello Java IO";

        fos.write(text.getBytes());
        fos.close();

        System.out.println("Data Written Successfully");
    }
}
