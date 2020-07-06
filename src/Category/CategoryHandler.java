package Category;

import Book.*;

import java.util.ArrayList;
import java.util.List;

public class CategoryHandler {
    private List<Category> categories = new ArrayList<>();


    public void addCategoryToCategoryList(Category newCategory){
        categories.add(newCategory);
    }

    public List<Category> getCategoryList(){
        return categories;
    }

    public void addBookToCategory(Book book,Category category)
    {
        category.getBooks().add(book); //o kategorideki kitap listesini get edip
                                        // yeni kitabı ekler
    }

}
