import java.util.Locale;

public class main {
    public static void main (String[]args){
    Circle c = new Circle(4);
    double cf = c.circumference();
    System.out.println(cf);
    System.out.println(c.getRadius());

    Rectangle r = new Rectangle(2, 5);
    System.out.println(r.perimeter());
    System.out.println(r.area());

    String s  = new String();
    s = "Hello World!";
    System.out.println(s);

    String s0 = new String();
    s0 = "Happy";
    System.out.println(s0.charAt(2));

    String s00 = new String();
    s00 = "FUNNY";
    System.out.println(s00.toLowerCase(Locale.ROOT));

    String s1 = new String();
    s1 = "UNHAPPY";
    String s2 = new String();
    s2 = s1.substring(2,7);
    System.out.println(s2);

    Book b1 = new Book( "Leo Tolstoy","War and Piece", 1000);
    Book b2 = new Book("René Goscinny","Le Petit Nicola", 100);
    System.out.println(b1.titleLength());
    System.out.println(b2.titleLength());





    }
}
