import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        //12
        int[] arr = new int[]{1,9,4,7,5};
        try {
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("An exception has occured");
        }

        //13,14
        Scanner sc = new Scanner(System.in);
        int ile = 1;
        do {
            System.out.println("Please enter an integer number from 0 to 10:  ");

            try{
                String input = sc.next();
                int i = Integer.parseInt(input);
                if (i>=0 && i<=10){
                    System.out.println("You entered: " + input);
                    break;
                }
                else{
                    throw new WrongNumberException("ZŁY PRZEDZIAŁ");
                }

            }
            catch (NumberFormatException e){
                System.out.println("You did not enter an integer value.");
            } catch (WrongNumberException e) {
                System.out.println(e.getS());
            }
            ile=ile+1;
        } while (true);
        System.out.println("podano " + ile + " wartosci");
    }
}
