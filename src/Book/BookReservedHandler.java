package Book;

import java.util.ArrayList;
import java.util.List;

public class BookReservedHandler {
    private List<Book> reservedBookList = new ArrayList<>();

    public void reserveBook(Book book){
        reservedBookList.add(book); //ikisini de yapcam mı teki mi gerekli
        book.setIsReserved(true);
    }

    public String checkIfReserved(Book book){
        if(book.getIsReserved()){
            return "Reserved.";
        }
        return "Available";
    }
}
