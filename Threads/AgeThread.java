public class AgeThread extends Thread{
    String data;
    AgeThread(String data){
        this.data = data;
    }

    @Override
    public void run() {
        CharSequence rok = data.subSequence(6,10);
        int rok1 = Integer.parseInt(rok.toString());
        System.out.print(2022 - rok1);
    }

}
