import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Please enter a word (LettersToNumbers): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LettersToNumbers lTn = new LettersToNumbers();
        System.out.println(lTn.code(input));

        System.out.print("Please enter a coded word (LettersToNumbers): ");
        input = sc.nextLine();
        System.out.println(lTn.decode(input));

        System.out.print("Please enter a word (MorseCode): ");
        input = sc.nextLine();
        MorseCode mc = new MorseCode();
        System.out.println(mc.code(input));

        System.out.print("Please enter a coded word (MorseCode): ");
        input = sc.nextLine();
        System.out.println(mc.decode(input));

        sc.close();
    }
}
