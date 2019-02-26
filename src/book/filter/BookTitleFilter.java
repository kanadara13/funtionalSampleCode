package book.filter;

import book.Book;

public class BookTitleFilter implements Filter {

    private String keyword;

    public BookTitleFilter(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(Book book) {
        return book.getTitle().contains(keyword);
    }
}
