public class main3 {
    public static void main(String[] args) {
        String data = "07/09/2001";
        CharSequence dzien = data.subSequence(0,2);
        String[] daty = new String[]{"21.03-20.04","21.04-21.05", "22.05-21.06","22.06-22.07","23.07-23.08",
                "24.08-22.09","23.09-22.10","23.10-22.11","23.11-21.12","22.12-19.01","20.01-18.02","19.02-20.03"};
        System.out.println(daty[0].subSequence(0,2));
        System.out.println(Integer.parseInt(dzien.toString()));
        int dzien1 = Integer.parseInt(dzien.toString());
        int dzien2 = Integer.parseInt(daty[0].subSequence(0,2).toString());
        boolean i = (dzien1<=dzien2);
        System.out.println(i);
        CharSequence miesiac = data.subSequence(3,5);
        System.out.println(miesiac);
    }
}
