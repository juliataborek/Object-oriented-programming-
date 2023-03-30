import java.util.Scanner;

public class LodowkaApp {
    public static void main(String[] args) {
        System.out.println("Wybierz operację: dodaj/ wez/ wyświetl/ zamknij: ");
        Scanner input = new Scanner(System.in);
        String w = input.next();
        Lodówka l = new Lodówka();
        while(w.equals("zamknij") == false){
            switch (w){
                case "dodaj":
                    System.out.println("Podaj nazwę i ilość: ");
                    String n = input.next();
                    int i = input.nextInt();
                    l.dodaj(n,i);
                    break;
                case "weź":
                    System.out.println("Podaj co weźmiesz i ile: ");
                    String n1 = input.next();
                    int i1 = input.nextInt();
                    l.wez(n1,i1);
                    break;
                case "wyświetl":
                    l.wyświetl();
                    break;
                case "zamknij":
                    break;
                default:
                    System.out.println("Nie ma takiej operacji.");
            }
            System.out.println("Wybierz operację: dodaj/ wez/ wyświetl/ zamknij: ");
            String w1 = input.next();
            w = w1;
        }
    }
}
