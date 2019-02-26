package book;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookShop {

    private List<Book> immutableBooks = Collections.unmodifiableList(Arrays.asList(new Book("역사책",BookCategory.HISTORY),new Book("자바",BookCategory.IT), new Book("소설책",BookCategory.NOVEL)));

    public List<Book> getImmutableBooks() {
        return immutableBooks;
    }
}
