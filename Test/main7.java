import java.util.ArrayList;

public class main7 {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<String>();
        arrL.add("one");
        arrL.add("two");
        arrL.add("three");

        arrL.clear();

        System.out.println("ArrayList size: " + arrL.size());
        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i));
        }
    }
}
