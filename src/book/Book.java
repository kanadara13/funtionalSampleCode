package book;

public class Book {

    private String title;
    private BookCategory category;

    public Book(String title, BookCategory category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public BookCategory getCategory() {
        return category;
    }
}
