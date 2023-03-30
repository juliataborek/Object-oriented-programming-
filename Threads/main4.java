import java.util.ArrayList;
import java.util.List;

public class main4 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        for (Object obj: list) {
            if (obj instanceof String){
                // this  is string
            } else if (obj instanceof Integer) {
                // this  is Integer
            }
        }
        List<List> listOfMixedTypes = new ArrayList<List>();

        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

        listOfMixedTypes.add(listOfStrings);
        listOfMixedTypes.add(listOfIntegers);

    }

}
