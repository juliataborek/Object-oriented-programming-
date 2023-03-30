public class WrongNumberException extends Exception{
    String s;
    WrongNumberException(String s){this.s = s;}

    public String getS() {
        return s;
    }
}
