import java.io.FileNotFoundException;
import java.io.FileReader;

public class main2 {
    public static void main(String[] args)  {
        //11
        try {
            FileReader fr = new FileReader("Text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
