package BookAuthorBusinessLayer;

import Author.Author;

import java.util.List;
import java.util.Optional;

public class AuthorSearchHandler { //yazar listesinde yazar arama
    public Optional<Author> searchAuthorByName(List<Author> authorList, Author author){
        return authorList.stream().filter(author1 -> author1.getAuthorName().equals(author.getAuthorName())).findFirst();
    }
}
