import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int i;

        String input2;
        int i2;

        do {
            System.out.println("Please enter an integer value: ");

            try{
                input = sc.next();
                i = Integer.parseInt(input);
                System.out.println("You entered: " + i);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("You did not enter an integer value.");
            }
        } while (true);

        do {
            System.out.println("Please enter second integer value: ");

            try{
                input2 = sc.next();
                i2 = Integer.parseInt(input2);
                System.out.println("You entered: " + i2);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("You did not enter an integer value.");
            }
        } while (true);

        try{
            System.out.println("wynik dzielenia: " + i/i2);
        }
        catch (ArithmeticException e){
            System.out.println("You can't devide by 0.");
        }

        System.out.println("The end.");
    }
}

