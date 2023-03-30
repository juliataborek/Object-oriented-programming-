import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Please enter any vowel (e/y/u/i/o/a): ");
            String input = sc.next();
            try{
                if (input.equals("a") || input.equals("e") || input.equals("u")|| input.equals("i") || input.equals("y") || input.equals("o") || input.equals("A") || input.equals("E") || input.equals("U")|| input.equals("I") || input.equals("Y") || input.equals("O")){
                    System.out.println("You entered: " + input);
                    break;
                }
                else{
                    throw new NotVowelException("Nie wpisano samogłoski");
                }
            }
            catch (NotVowelException e){
                System.out.println(e.getS());
            }
        }while (true);

    }
}
