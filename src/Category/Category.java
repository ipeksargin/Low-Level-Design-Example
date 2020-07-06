package Category;

import Book.*;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Book> books = new ArrayList<>();

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
