package book;

import java.util.List;

public class Printer {

    public static void print(List<Book> books) {
        System.out.println("==================================================================================================");
        books.stream().forEach(e->{
            System.out.println(e.getTitle());
        });
    }
}
