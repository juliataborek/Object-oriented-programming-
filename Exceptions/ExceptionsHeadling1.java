import java.io.*;
public class ExceptionsHeadling1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Test.txt");
            fw.write("Hello");
            fw.close();
            FileReader f = new FileReader("Test.txt");
            int i;
            while ((i = f.read())!= -1 ){
                System.out.print((char)i);
            }
            f.close();

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
