package włoski;

public class Słownik {
    public String [] słowaWł = {"uno", "due", "tre"};
    public String [] słowaPl = {"jeden","dwa", "trzy"};

    public String sprawdzWł(String pl, String wl){
        for(int i=0;i <3;i++){
            if(pl.equals(słowaPl[i])){
                if(wl.equals(słowaWł[i])){
                    return "Poprawnie.";
                }
                else{
                    return "Niepoprawnie, popraw nie to: " + słowaWł[i];
                }
            }
        }
        return "nic";
    }

    public String sprawdzPl(String wl, String pl){
        for(int i=0;i <3;i++){
            if(wl.equals(słowaWł[i])){
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