package org.yearup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.yearup.data.CategoryDao;
import org.yearup.data.ProductDao;
import org.yearup.models.Category;
import org.yearup.models.Product;

import java.util.List;

// Annotate this class as a REST controller
@RestController

// Set the base URL for this controller
@RequestMapping("/categories")

// Allow cross-origin requests
@CrossOrigin
public class CategoriesController
{
    private final CategoryDao categoryDao;
    private final ProductDao productDao;

    // Constructor to inject CategoryDao and ProductDao
    @Autowired
    public CategoriesController(CategoryDao categoryDao, ProductDao productDao)
    {
        this.categoryDao = categoryDao;
        this.productDao = productDao;
    }

    // Annotation for a GET action to return all categories
    @GetMapping
    public List<Category> getAll()
    {
        // Find and return all categories
        return categoryDao.findAll();
    }

    // Annotation for a GET action to return a specific category by ID
    @GetMapping("/{id}")
    public Category getById(@PathVariable int id)
    {
        // Get the category by id
        return categoryDao.findById(id);
    }

    // Annotation for a GET action to return products in a specific category
    @GetMapping("{categoryId}/products")
    public List<Product> getProductsById(@PathVariable int categoryId)
    {
        // Get a list of products by categoryId
        return productDao.findByCategoryId(categoryId);
    }

    // Annotation for a POST action to add a new category
    // Ensure only ADMIN can call this method
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category addCategory(@RequestBody Category category)
    {
        // Insert the category
        return categoryDao.insert(category);
    }

    // Annotation for a PUT action to update a category
    // Ensure only ADMIN can call this method
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCategory(@PathVariable int id, @RequestBody Category category)
    {
        // Update the category by id
        categoryDao.update(id, category);
    }

    // Annotation for a DELETE action to delete a category
    // Ensure only ADMIN can call this method
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable int id)
    {
        // Delete the category by id
        categoryDao.delete(id);
    }
}

