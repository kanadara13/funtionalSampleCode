package book;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookShop {

    private List<Book> immutableBooks = Collections.unmodifiableList(Arrays.asList(new Book("역사책",BookCategory.HISTORY, true),new Book("자바",BookCategory.IT, true), new Book("소설책",BookCategory.NOVEL, false)));

    public List<Book> getImmutableBooks() {
        return immutableBooks;
    }
}
