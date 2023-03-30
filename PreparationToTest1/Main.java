public class Main{
    public static void main(String[] args){
        // ex 1
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        //ex 2
        int i = 1;
        switch (i){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println(">4");
        }


        //ex 3
        int i2=2;
        switch(i2){
            case(1):
                System.out.println("January");
                break;
            case(2):
                System.out.println("February");
                break;
            case(3):
                System.out.println("March");
                break;
            case(4):
                System.out.println("April");
                break;
        }
        // ex.4 - == zamiast =

        if(i==0){
            System.out.println("zero");
        }
        else{
            System.out.println("not zero");
        }

        // ex.5 - equals
        String s1 = new String("Happy");
        String s2 = new String("Happy");
        if (s1.equals(s2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //ex. 6, 7
        Person p = new Person("Julia", 20 );
        System.out.println("Name: "+ p.GetName());
        System.out.println("Age: " + p.GetAge());



        //ex.9
        Editor e = new Editor();
        System.out.println(e.smallLetters("JULIA"));
        System.out.println(e.capitalLetters("julia"));
        System.out.println(e.mergeWords("Julia", "Julek"));

        //ex.10
        Book b = new Book("a","b");
        b.print();
        System.out.println(b.GetTitle());
        b.SetAuthor("unknown");


    }
}
