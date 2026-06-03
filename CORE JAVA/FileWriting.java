import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {

        try {

            FileWriter fw =
                    new FileWriter("output.txt");

            fw.write("Hello File");

            fw.close();

            System.out.println("File Written");

        } catch (IOException e) {

            System.out.println(e);
        }
    }
}