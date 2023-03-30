public class Rzeczownik implements Przypadki{
    public String noun;
    Rzeczownik(String n){
        noun = n;

    }

    @Override
    public String dopelniacz(String gender) {
        String koniec;
        switch (gender){
            case "ż":
                koniec = "-y/-i";
                break;
            case "m":
                koniec = "-a/-u";
                break;
            case "n":
                koniec = "-a";
                break;
            default:
                koniec= "";
        }
        return noun + koniec;
    }
}
