public class NotVowelException extends Exception{
    String s;
    NotVowelException(String s){this.s = s;}
    public String getS() {
        return s;
    }
}
