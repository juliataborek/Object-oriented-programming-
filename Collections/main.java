import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Stack<String> bag = new Stack<String>();
        LinkedList<String> l = new LinkedList<String>(bag);
        System.out.println("put/take/print/exit ");
        Scanner input = new Scanner(System.in);
        String w = input.next();
        while(w.equals("exit") == false){
            switch (w){
                case "put":
                    System.out.println("Podaj nazwę: ");
                    String n = input.next();
                    l.push(n);
                    break;
                case "take":
                    l.pop();
                    break;
                case "print":
                    l.forEach(System.out::println);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Nie ma takiej operacji.");
            }
            System.out.println("put/take/print/exit ");
            String w1 = input.next();
            w = w1;
        }
    }
}
