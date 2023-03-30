import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        try{
            int wiek = input.nextInt();
            if(wiek < 18){
                throw new TooYoungException("You are too young.");
            }
            else{
                System.out.print("You entered: " + wiek);
            }
        }
        catch(TooYoungException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("You did not enter an integer value.");
        }
        input.close();
    }
}
