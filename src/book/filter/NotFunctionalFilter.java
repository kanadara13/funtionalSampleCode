package book.filter;

import book.Book;

public interface NotFunctionalFilter extends Filter {
    boolean moreTest(Book book);
}
