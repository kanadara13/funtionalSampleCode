package book.filter;

import book.Book;

@FunctionalInterface
public interface Filter {
    boolean test(Book book);

    default void ignoreThidMethod(){
        System.out.println("함수형 인터페이스의 정의에서 디폴트 메서드는 상관없다는걸 보여주기 위함");
    }
}
