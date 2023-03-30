import java.util.LinkedList;
import java.util.ListIterator;

public class main12 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        ListIterator lI = l.listIterator();
        while(lI.hasNext()){
            System.out.println(lI.next());
        }
    }
}
