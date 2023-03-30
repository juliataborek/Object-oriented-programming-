import java.util.Scanner;

public class main2 {
    public static void main(String[] args) throws InterruptedException {
        String[] znaki = new String[]{"baran","byk","bliźnięta","rak","lew",
                "panna","waga","skorpion","strzelec","koziorożec","wodnik","ryby"};
        String[] daty = new String[]{"21.03-20.04","21.04-21.05", "22.05-21.06","22.06-22.07","23.07-23.08",
                "24.08-22.09","23.09-22.10","23.10-22.11","23.11-21.12","22.12-19.01","20.01-18.02","19.02-20.03"};
        System.out.println("Podaj date urodzenia(d/m/r): ");
        Scanner input = new Scanner(System.in);
        String data = input.next();
        CharSequence rok = data.subSequence(6,9);
        AgeThread AGE = new AgeThread(data);
        AGE.start();
        ZnakThread ZNAK = new ZnakThread(daty,znaki,data);
        ZNAK.start();
        AGE.join();
        ZNAK.join();
        System.out.println("Koniec");

    }
}
