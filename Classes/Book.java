public class Book {
    String author;
    String title;
    int noOfPages;

    Book(String a, String t, int no){
        author = a;
        title = t;
        noOfPages = no;
    }

    public int titleLength(){
        return title.length();
    }
}
