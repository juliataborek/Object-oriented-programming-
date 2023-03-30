public class main {
    public void main(String[] args) throws InterruptedException {
        Tekst t = new Tekst("AeuioJJnjkOnlknkjhknkIHOOOOOOOOOOOFGHEiunFeRUOI");
        SmallLettersThread sm = new SmallLettersThread(t);
        NoVowelsThread nv = new NoVowelsThread(t);
        sm.start();
        sm.join();
        nv.start();
        nv.join();
        System.out.println("Koniec");
    }
}
