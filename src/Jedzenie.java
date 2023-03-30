public class Jedzenie {
    String nazwa;
    int ilosc;
    Jedzenie(String nazwa,int ilosc){
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }
    public int getIlosc() {
        return ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
