package Book;

import java.util.ArrayList;
import java.util.List;

public class BookCrudHandler {
    private List<Book> bookList = new ArrayList<>();

    public BookCrudHandler(){}

    public void addBookToBookList(Book bookName){
        bookList.add(bookName);
    }

    public List<Book> getBookList(){
        return bookList;
    }
    //update ve delete gelebilir

}
