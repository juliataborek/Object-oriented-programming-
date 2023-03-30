import java.util.Scanner;

public class main2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word in Italian: ");
        String i = input.next();
        ItalianBasic ib = new ItalianBasic();
        System.out.println("In Polish: "+ ib.itTOpl(i));

        ItalianAdvanced ia = new ItalianAdvanced();
        System.out.println("Enter a word in Italian: ");
        String i1 = input.next();
        System.out.println("In Polish: "+ ia.itTOpl(i1));

        System.out.println("Enter a word in Polish: ");
        String p = input.next();
        System.out.println("In Italian: "+ ib.plToit(p));

        System.out.println("Enter a word in Polish: ");
        String p1 = input.next();
        System.out.println("In Italian: "+ ia.plToit(p1));

        System.out.println("Enter a number in Polish: ");
        String np = input.next();
        System.out.println("In Italian: " + ia.noTOit(np));

        System.out.println("Enter a number in Italian: ");
        String ni = input.next();
        System.out.println("In Italian: " + ia.noTOpl(ni));
    }
}
