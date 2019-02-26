package book.filter;

import book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFilterNotWork {

    private NotFunctionalFilter filter;
    private List<Book> books;

    public BookFilterNotWork(NotFunctionalFilter filter, List<Book> books) {
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
            if (filter.moreTest(each)){
                filteredBooks.add(each);
            }
        }
        return filteredBooks;
    }
}
