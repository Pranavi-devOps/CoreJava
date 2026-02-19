import java.io.*;

public class WriteUsingBufferedWriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt"));

        bw.write("Buffered Writer Example");
        bw.newLine();
        bw.write("Second Line");

        bw.close();
        System.out.println("Data Written");
    }
}
