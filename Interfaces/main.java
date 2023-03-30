import java.util.Scanner;

public class main {
    public static void main(String[]args){
        System.out.println("Enter the figure: ");
        Scanner input= new Scanner(System.in);
        String s = input.next();
        System.out.println("You entered: "+ s);
        switch (s){
            case "circle":
                System.out.println("Enter radius: ");
                Double r = input.nextDouble();
                Circle c = new Circle(r);
                System.out.println("Area: "+ c.area());
                System.out.println("Perimeter: "+ c.perimeter());
                break;

            case "square":
                System.out.println("Enter side: ");
                Double sd = input.nextDouble();
                Square k = new Square(sd);
                System.out.println("Area: " + k.area());
                System.out.println("Perimeter: " + k.perimeter());
                break;

            case "rectangle":
                System.out.println("Enter sides: ");
                double s1 = input.nextDouble();
                double s2 = input.nextDouble();
                Rectangle p = new Rectangle(s1,s2);
                System.out.println("Area: "+ p.area());
                System.out.println("Perimeter: " + p.perimeter());
                break;

            default:
                System.out.println("There is no such figure.");
        }

    }
}
