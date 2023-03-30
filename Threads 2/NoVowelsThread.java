import java.util.Arrays;
import java.util.List;

public class NoVowelsThread extends Thread{
    Tekst Content;
    public NoVowelsThread(Tekst c){
        Content = c;
    }

    @Override
    public void run() {
        String Content1 = Content.toString();
        Content1 = Content1.replaceAll("[aeiou]"," ");
        System.out.println(Content1);
    }
}
