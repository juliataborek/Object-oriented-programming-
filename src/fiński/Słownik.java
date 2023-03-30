package fiński;

public class Słownik {
    public String [] słowaFi = {"yksi","kaksi","kolme"};
    public String [] słowaPl = {"jeden","dwa","trzy"};

    public String sprawdzFi(String pl, String fi){
        for(int i=0;i <3;i++){
            if(pl.equals(słowaPl[i])){
                if(fi.equals(słowaFi[i])){
                    return "Poprawnie.";
                }
                else{
                    return "Niepoprawnie, popraw nie to: " + słowaFi[i];
                }
            }
        }
        return "nic";
    }

    public String sprawdzPl(String fi, String pl){
        for(int i=0;i <3;i++){
            if(fi.equals(słowaFi[i])){
                if(pl.equals(słowaPl[i])){
                    return "Poprawnie.";
                }
                else{
                    return "Niepoprawnie, poprawnie to: " + słowaPl[i];
                }
            }
        }
        return "nic";
    }
}
