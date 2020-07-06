package BookCategoryBusinessLayer;

import Book.*;

import java.util.List;
import java.util.Optional;

public class BookSearchHandler {
    public Optional<Book> findBookByBookName(List<Book> bookList, Book bookName){
        Optional<Book> books = bookList.stream()
                .filter(book -> book.getBookName().equals(bookName.getBookName())).findFirst();
        return books;
    }

}
