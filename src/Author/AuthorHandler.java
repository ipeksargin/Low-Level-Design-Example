package Author;
import Book.*;

import java.util.ArrayList;
import java.util.List;

public class AuthorHandler {
    private List<Author> authorList = new ArrayList<>();

    public void addAuthorToAuthorList(Author author){
        authorList.add(author);
    }

    public List<Author> getAuthorList(){
        return authorList;
    }

    public void addAuthorToBook(Author author, Book book){
        author.getBooks().add(book);
    }

}
