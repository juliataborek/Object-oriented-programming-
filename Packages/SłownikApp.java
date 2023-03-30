import włoski.Słownik;
// import fiński.Słownik;

import java.util.Scanner;

public class SłownikApp {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Słownik w = new Słownik();
        System.out.println("Przetlumacz słowo 1. Po polsku: ");
        String p1 = input.next();
        System.out.println("Po włosku: ");
        String w1 = input.next();
        System.out.println(w.sprawdzWł(p1,w1));

        System.out.println("Przetlumacz słowo 1. Po wlosku: ");
        String w2 = input.next();
        System.out.println("Po polsku: ");
        String p2 = input.next();
        System.out.println(w.sprawdzPl(w2,p2));

        fiński.Słownik f = new fiński.Słownik();


    }
}
