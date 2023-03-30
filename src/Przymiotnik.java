public class Przymiotnik implements  Przypadki{
    String przymiotnik;
    Przymiotnik(String prz){
        przymiotnik = prz;
    }

    @Override
    public String dopelniacz(String gender) {
        String koniec;
        switch (gender){
            case "ż":
                koniec = "-ej";
                break;
            case "m":
                koniec = "-ego";
                break;
            case "n":
                koniec = "-ego";
                break;
            default:
                koniec= "";
        }
        return przymiotnik + koniec;
    }
}
