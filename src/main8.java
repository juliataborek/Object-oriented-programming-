public class main8 {
    public static void main (String[] args){
        try {
            System.out.println(5/0);
        }
        catch(ArithmeticException ex){
            System.out.println("It is not allowed to devide by zero");
        }
    }
}