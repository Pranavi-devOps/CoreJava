import java.io.*;

public class ReadUsingFileReader {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("sample.txt");
        int data;

        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }

        fr.close();
    }
}
