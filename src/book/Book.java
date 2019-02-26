package book;

public class Book {

    private String title;
    private BookCategory category;
    private boolean limited;

    public Book(String title, BookCategory category, boolean limited) {
        this.title = title;
        this.category = category;
        this.limited = limited;
    }

    public String getTitle() {
        return title;
    }

    public BookCategory getCategory() {
        return category;
    }

    public boolean isLimited() {
        return limited;
    }
}
