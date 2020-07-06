package Book;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookSearchHandler {
    private List<Book> books;

    BookSearchHandler(List<Book> books){
        this.books = books;
    }

    public List<Book> findBookByLanguage(String langName) {
        return books.stream().filter(book -> book.getLanguage().toString().equals(langName)).collect(Collectors.toList());
    }//gelen resultun list dönmesi icin collect(Collectors.toList())
    //optional null pointer ex almamanı sağlar

    public Optional<Book> findBookByBookName(String bookName){
        return books.stream().filter(book1 -> book1.getBookName().equals(bookName)).findFirst();
    }



}
