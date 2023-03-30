import java.util.ArrayList;

public class Lodówka {
    static ArrayList<Jedzenie> jedzenies = new ArrayList<>();
    public static void dodaj(String nazwa,int ilosc){
        Jedzenie Jedzenie1 = new Jedzenie(nazwa,ilosc);
        jedzenies.add(Jedzenie1);
    }
    public static void wez(String nazwa,int ilosc){
        String message = "There is no such food";
        for(int i=0; i<jedzenies.size();i++){
            if(jedzenies.get(i).getNazwa().equals(nazwa) && jedzenies.get(i).getIlosc()>=ilosc){
                message = "The food <" +nazwa+ "> is taken";
                jedzenies.get(i).setIlosc(jedzenies.get(i).getIlosc() - ilosc);
                if(jedzenies.get(i).getIlosc() == 0){
                    jedzenies.remove(jedzenies.get(i));
                }
                break;
            }
        }
        System.out.println(message);
    }
    public static void wyświetl(){
        if(jedzenies.size() == 0){
            System.out.println("Pusta lodówka");
        }
        for(int i =0; i< jedzenies.size(); i++){
            System.out.println(jedzenies.get(i).getNazwa() +" "+ jedzenies.get(i).getIlosc());
        }
    }


}
