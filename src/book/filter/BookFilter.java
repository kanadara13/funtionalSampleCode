package book.filter;

import book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFilter {

    private Filter filter;
    private List<Book> books;

    public BookFilter(Filter filter, List<Book> books) {
        this.filter = filter;
        this.books = books;
    }

    private Filter getFilter() {
        return filter;
    }

    private List<Book> getBooks() {
        return books;
    }

    public List<Book> filter(){
        List<Book> filteredBooks = new ArrayList<>();
        for (Book each : getBooks()){
            if (filter.test(each)){
                filteredBooks.add(each);
            }
        }
        return filteredBooks;
    }
}
