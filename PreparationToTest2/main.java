import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.print(arr[2]);
        System.out.println(" ");
        System.out.println(arr1.get(2));

        //3
        LinkedList<Character> listL = new LinkedList<Character>();
        listL.add('a');
        listL.add('b');
        listL.add('c');

        //4


        //5
        ArrayList<String> st = new ArrayList<>();
        st.add("one");
        st.add("two");
        st.add("three");
        System.out.println(st.remove(2));
        System.out.println(st.remove(1));
        System.out.println(st.remove(0));

        //6
        HashSet<String>fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("cherry");
        System.out.println(fruits);

        //8 - nie wyswoetla powtarzających sie elememtow
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("banana");
        ts.add("pineapple");
        ts.add("apple");
        ts.add("banana");
        ts.add("cherry");
        System.out.println(ts);

        //9 - zobaczymy ta ostatnia wartosc jaka zostala przypisana do 39
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(7, "leo");
        hmap.put(39, "dog");
        hmap.put(643, "bird");
        hmap.put(39, "take");
        System.out.println(hmap.size());
        System.out.println(hmap.get(39));

        //10
        int i1 = 9;
        int i2 = 0;
        try{
            System.out.println("wynik dzielenia: " + i1/i2);
        }
        catch (ArithmeticException e){
            System.out.println("You can't devide by 0.");
        }


    }
}
