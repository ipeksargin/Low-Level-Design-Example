package BookCategoryBusinessLayer;

import Category.*;

import java.util.List;
import java.util.Optional;

public class CategorySearchHandler {
    public Optional<Category> findCategoryByCategoryName(List<Category> categories, Category category)
    {
        Optional<Category> cat = categories.stream().
                filter(category1 -> category1.getCategoryName().equals(category.getCategoryName())).findFirst();

        return cat;
    }
}
