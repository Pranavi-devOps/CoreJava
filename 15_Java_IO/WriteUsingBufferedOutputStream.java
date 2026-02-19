import java.io.*;

public class WriteUsingBufferedOutputStream {

    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sample.txt"));

        String text = "Buffered Output Example";
        bos.write(text.getBytes());

        bos.close();
        System.out.println("Written Successfully");
    }
}
