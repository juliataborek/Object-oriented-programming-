import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int l = input.nextInt();
        ScientificCalculator S = new ScientificCalculator();
        System.out.println("Factorial: " + S.factorial(l));

        System.out.println("Enter another integer: ");
        int l2 = input.nextInt();
        System.out.println("Add: " + S.add(l,l2));
        System.out.println("Substruct: " + S.substruct(l,l2));
        System.out.println("Modulo: " + S.modulo(l,l2));

        System.out.println("Enter 2 integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        CalculatorProgrammer c = new CalculatorProgrammer();
        System.out.println("Add: " + c.add(a, b));
        System.out.println("Or: " + c.or(a, b));
    }
}
