public class ZnakThread extends Thread{
    String data;
    String[] znaki;
    String[] daty;

    ZnakThread(String[] znaki,String [] daty, String data ){
        this.znaki = znaki;
        this.data = data;
        this.daty = daty;
    }


    @Override
    public void run() {
        CharSequence miesiac = data.subSequence(3,5);
        for(int i =0;i<= daty.length;i++){
            if(daty[i].subSequence(3,5) == miesiac){
                CharSequence dzien = data.subSequence(0,2);
                int dzien1 = Integer.parseInt(dzien.toString());
                int dzien2 = Integer.parseInt(daty[i].subSequence(0,2).toString());
                if(dzien1>=dzien2){
                    String twojznak = znaki[i];
                    System.out.println(twojznak);
                    break;
                }
                if (dzien1<dzien2){
                    String twojznak = znaki[i-1];
                    System.out.println(twojznak);
                    break;
                }
            }
        }

    }
}
