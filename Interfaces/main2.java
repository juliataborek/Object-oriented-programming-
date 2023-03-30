import java.util.Scanner;

public class main2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter noun: ");
        String n = input.next();
        Rzeczownik rz = new Rzeczownik(n);
        System.out.println("Gender: ");
        String g = input.next();
        System.out.println(rz.dopelniacz(g));

        System.out.println("Enter adjective: ");
        String a = input.next();
        Przymiotnik p = new Przymiotnik(a);
        System.out.println("Gender: ");
        String g1 = input.next();
        System.out.println(p.dopelniacz(g1));

        
    }
}
