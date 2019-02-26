package book.filter;

import book.Book;
import book.BookCategory;

public class BookCategoryFilter implements Filter {

    private BookCategory category;

    public BookCategoryFilter(BookCategory category) {
        this.category = category;
    }

    @Override
    public boolean test(Book book) {
        return book.getCategory() == category;
    }
}
