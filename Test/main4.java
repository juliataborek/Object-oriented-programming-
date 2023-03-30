import java.io.FileNotFoundException;
import java.io.FileReader;

public class main4 {
    public static void main (String[] args)  {
        try {
            FileReader fr = new FileReader("Text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
