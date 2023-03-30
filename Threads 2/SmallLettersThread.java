import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SmallLettersThread extends Thread{
    Tekst Content;
    public SmallLettersThread(Tekst c){
        Content = c;
    }

  

    @Override
    public void run() {
        Content = Content.toLowerCase();
        System.out.println(Content.toString());
        List<Character> samogloski = Arrays.asList('a','e','u','y','i','o');
        int licz=0;
        for(int i =0;i< Content.lenght();i++){
            char ch = Content.charAt(i);
            if (samogloski.contains(ch)){
                licz=licz +1;
            }
        }
        System.out.println("Liczba samoglosek: " + licz);



    }
}
