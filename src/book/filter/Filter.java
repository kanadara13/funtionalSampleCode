package book.filter;

import book.Book;

@FunctionalInterface
public interface Filter {
    boolean test(Book book);
}
