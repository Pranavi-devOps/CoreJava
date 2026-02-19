import java.io.*;

public class ReadUsingBufferedInputStream {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample.txt"));

        int data;
        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }

        bis.close();
    }
}
