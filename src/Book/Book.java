package Book;

import Enums.*;

public class Book {
    private String bookName;
    private Language language;
    private String bookLocation; //string olarak kendim vericem
    private boolean isReserved = false;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getLocation() {
        return bookLocation;
    }

    public void setLocation(String bookLocation) {
        this.bookLocation = bookLocation;
    }

    public void setIsReserved(boolean reserved) {
        isReserved = reserved;
    }

    public boolean getIsReserved() {
        return isReserved;
    }
}
