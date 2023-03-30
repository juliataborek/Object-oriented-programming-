import java.util.Locale;

public class Tekst {
    String content;
    Tekst(String c){
         content = c;
    }
    public Tekst toLowerCase(){
        return new Tekst(content.toLowerCase(Locale.ROOT));
    }

    public int lenght(){
        return content.length();
    }

    public char charAt(int i){
        return content.charAt(i);
    }

    public String toString(){
        return content;
    }

}
