import Author.*;
import Book.*;
import BookAuthorBusinessLayer.AuthorBookSearchHandler;
import BookAuthorBusinessLayer.AuthorSearchHandler;
import BookCategoryBusinessLayer.BookSearchHandler;
import BookCategoryBusinessLayer.CategorySearchHandler;
import Category.*;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("birinciKitap"); //anladım
        Book secondBook = new Book("ikinciKitap");
        Book thirdBook = new Book("ucuncuKitap");
        Book fourthBook = new Book("dorduncuKitap");


        Category categoryOne = new Category("gerilim"); //anladım
        Category categoryTwo = new Category("dram");
        Category categoryThree = new Category("bilim");

        CategoryHandler categoryHandler = new CategoryHandler(); //anladım kitapları kategorilere ekledik
        categoryHandler.addBookToCategory(firstBook,categoryOne);
        categoryHandler.addBookToCategory(secondBook,categoryTwo);
        categoryHandler.addBookToCategory(thirdBook,categoryThree);

        categoryHandler.addCategoryToCategoryList(categoryOne); //kategori listesi oluşturduk so that we can search inside it
        // constructorda olusturduktan sonra listeye ekledik
        categoryHandler.addCategoryToCategoryList(categoryTwo);
        categoryHandler.addCategoryToCategoryList(categoryThree);


        BookCrudHandler bookHandler = new BookCrudHandler(); //kitap listesi oluşturduk so that we can search inside it
        bookHandler.addBookToBookList(secondBook);
        bookHandler.addBookToBookList(thirdBook);
        bookHandler.addBookToBookList(firstBook);

        BookSearchHandler bookSearchHandler = new BookSearchHandler(); //bookList içinde book aradık
        bookSearchHandler.findBookByBookName(bookHandler.getBookList(), firstBook);
        bookSearchHandler.findBookByBookName(bookHandler.getBookList(), secondBook);

        CategorySearchHandler categorySearchHandler = new CategorySearchHandler(); //categoryList içinde kategori aradık
        categorySearchHandler.findCategoryByCategoryName(categoryHandler.getCategoryList(),categoryThree);

        Author yazarBir = new Author("ipek");
        Author yazarIki = new Author("ahmet");
        Author yazarUc = new Author("guzin");

        AuthorHandler authorHandler = new AuthorHandler();
        authorHandler.addAuthorToAuthorList(yazarBir);//author liste ekle
        authorHandler.addAuthorToAuthorList(yazarIki);
        authorHandler.addAuthorToAuthorList(yazarUc);

        authorHandler.addAuthorToBook(yazarBir,firstBook);//book ve author
        authorHandler.addAuthorToBook(yazarIki,secondBook);
        authorHandler.addAuthorToBook(yazarUc,thirdBook);

        AuthorBookSearchHandler authorBookSearchHandler = new AuthorBookSearchHandler();
        authorBookSearchHandler.searchBookByAuthor(yazarBir);

        AuthorSearchHandler authorSearchHandler = new AuthorSearchHandler();
        authorSearchHandler.searchAuthorByName(authorHandler.getAuthorList(), yazarBir); //

    }
}
