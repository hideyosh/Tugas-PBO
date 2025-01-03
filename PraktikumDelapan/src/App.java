public class App {
    public static void main(String[] args) throws Exception {
        LibraryManager.addBooks(10);
        LibraryManager.removeBooks(5);
        LibraryManager.displayTotalBooks();
    }
}
