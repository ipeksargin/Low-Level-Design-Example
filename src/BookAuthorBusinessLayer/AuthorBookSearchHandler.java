package BookAuthorBusinessLayer;

import Author.Author;
import Book.Book;

import java.util.List;

public class AuthorBookSearchHandler { //yazara göre kitap arama
    public List<Book> searchBookByAuthor(Author author){
         return author.getBooks();
    }
}
