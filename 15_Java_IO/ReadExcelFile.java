import java.io.*;

public class ReadExcelFile {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        br.close();
    }
}
