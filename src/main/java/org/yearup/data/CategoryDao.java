package org.yearup.data;

import org.yearup.models.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAll(); // Retrieve all categories
    Category findById(int categoryId); // Retrieve a category by its ID
    Category insert(Category category); // Insert a new category
    void update(int categoryId, Category category); // Update an existing category
    void delete(int categoryId); // Delete a category by its ID
}

