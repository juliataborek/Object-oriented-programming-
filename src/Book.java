public class Book {
    private String title;
    private String author;
    Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    public void print(){
        System.out.println(title+" "+author);
    }

    public String GetTitle() {
        return title;
    }

    public String GetAuthor() {
        return author;
    }

    public void SetAuthor(String a) {
        author = a;
    }
}
