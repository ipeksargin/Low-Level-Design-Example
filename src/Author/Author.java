package Author;

import Book.*;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String authorName;
    private List<Book> books = new ArrayList<>(); //yazar icin kitap listesi


    public Author(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public List<Book> getBooks() {
        return books;
    }
}
