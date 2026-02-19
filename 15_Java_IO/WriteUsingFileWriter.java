import java.io.*;

public class WriteUsingFileWriter {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Writing using FileWriter");
        fw.close();

        System.out.println("Data Written");
    }
}
