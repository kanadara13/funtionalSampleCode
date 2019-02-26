import book.Book;
import book.BookCategory;
import book.BookShop;
import book.Printer;
import book.filter.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        System.out.println("WELCOME TO MY SHOP!");
        List<Book> books = bookShop.getImmutableBooks();
        Printer.print(books);
        List<Book> onlyItBooks = getBooksByBookCategoryBeforeJava8(books, BookCategory.IT);
        Printer.print(onlyItBooks);
        List<Book> booksFilteredByTitle = getBooksByTitleBeforeJava8(books, "자");
        Printer.print(booksFilteredByTitle);

        List<Book> filteredByBookTitleFilter = new BookFilter(new BookTitleFilter("자"),books).filter();
        Printer.print(filteredByBookTitleFilter);

        List<Book> filteredByBookCategoryFilter = new BookFilter(new BookCategoryFilter(BookCategory.NOVEL),books).filter();
        Printer.print(filteredByBookCategoryFilter);

        List<Book> filteredByAnonymous = new BookFilter(new Filter() {
            @Override
            public boolean test(Book book) {
                return book.getCategory() ==  BookCategory.HISTORY;
            }
        }, books).filter();
        Printer.print(filteredByAnonymous);

        List<Book> filterWithLambda = new BookFilter(book -> book.getCategory() ==  BookCategory.HISTORY, books).filter();
        Printer.print(filterWithLambda);

        List<Book> limitedBooks = new BookFilter(b -> b.isLimited(), books).filter();
        Printer.print(limitedBooks);

        List<Book> limitedBooksByMethodReference = new BookFilter(Book::isLimited, books).filter();
        Printer.print(limitedBooksByMethodReference);
        //List<Book> filterWithLambdaV2 = new BookFilterNotWork(book -> book.getCategory() ==  BookCategory.HISTORY, books).filter();

        List<Book> limitedBooksByStream = books.stream().filter(book -> book.isLimited()).collect(Collectors.toList());
        Printer.print(limitedBooksByStream);
    }

    private static List<Book> getBooksByTitleBeforeJava8(List<Book> books, String keyword) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book each : books){
            if (each.getTitle().contains(keyword)){
                filteredBooks.add(each);
            }
        }
        return filteredBooks;
    }

    private static List<Book> getBooksByBookCategoryBeforeJava8(List<Book> books, BookCategory category) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book each : books){
            if (each.getCategory() == category){
                filteredBooks.add(each);
            }
        }
        return filteredBooks;
    }
}
