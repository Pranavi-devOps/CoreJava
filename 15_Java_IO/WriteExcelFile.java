import java.io.*;

public class WriteExcelFile {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.csv"));

        bw.write("ID,Name,City");
        bw.newLine();
        bw.write("1,Pranavi,Hyderabad");
        bw.newLine();
        bw.write("2,Ravi,Chennai");

        bw.close();

        System.out.println("Excel (CSV) File Written Successfully");
    }
}
