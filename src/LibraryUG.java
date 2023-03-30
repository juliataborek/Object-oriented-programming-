public class LibraryUG implements BookManager {
    @Override
    public void addBook(String title, String author) {
        System.out.println("addBook");
    }

    @Override
    public void findBook(String title) {
        System.out.println("findBook");
    }

    @Override
    public void removeBook() {
        System.out.println("removeBook");
    }
}
