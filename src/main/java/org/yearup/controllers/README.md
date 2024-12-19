# Capstone Project: E-Commerce Backend API
# Overview

This project is a simple e-commerce API developed using Java Spring Boot and MySQL. It provides basic CRUD (Create, Read, Update, Delete) operations for managing categories and products. The API is designed for developers to integrate product and category management functionalities into their e-commerce platforms.

# Features

# 1.Category Management
Add new categories.
Retrieve a list of all categories.
Update or delete existing categories.

# 2.Product Management
Add new products.
Retrieve, update, or delete products by ID.
Search for products based on filters such as category, price range, and color.

# Project Phases
# Phase 1: API Design
Created RESTful endpoints for managing products and categories.
Ensured that each endpoint aligns with HTTP standards (GET, POST, PUT, DELETE).
Examples of Endpoints:
GET /categories - Retrieve all categories.
POST /products - Add a new product.
PUT /categories/{id} - Update a category by ID.
DELETE /products/{id} - Delete a product by ID.

# Phase 2: Database Integration
Integrated a MySQL database to persist categories and products.
Established data access using custom DAOs (CategoryDao, ProductDao) implemented with MySQL queries.
Used the MySqlCategoryDao and MySqlProductDao classes to handle database interactions for categories and products respectively.

# Phase 3: Business Logic Implementation
Added logic to handle the core operations:
Validate requests (e.g., checking if a product or category exists before updating or deleting).
Map database rows to Java objects using helper methods.
Handle errors and return appropriate HTTP status codes.

# Screenshots
![FilterScreen.png](..%2F..%2F..%2F..%2F..%2Fimages%2FFilterScreen.png)

![MainMenuScreen.png](..%2F..%2F..%2F..%2F..%2Fimages%2FMainMenuScreen.png)

![TestingEndpoints.png](..%2F..%2F..%2F..%2F..%2Fimages%2FTestingEndpoints.png)

# Interesting Code
![InterestingCode.png](..%2F..%2F..%2F..%2F..%2Fimages%2FInterestingCode.png)
This code defines an endpoint in a REST controller to retrieve all categories from a data source.

@GetMapping(""): Maps this method to handle GET /categories requests.

categoryDao.findAll(): Fetches a list of all categories from the database.

Error Handling: If an error occurs, it sends back a 500 Internal Server Error response with a message: "Error retrieving categories".
In short, this method returns all categories or an error if something goes wrong.

# Tools Used
Spring Boot for building RESTful APIs.
MySQL as the relational database.
Postman for API testing and demonstration.
IntelliJ IDEA as the IDE for development.

# How to Test the Project
# Using Postman
Import the provided Postman collection or manually configure requests.
Test each endpoint:
GET: Retrieve categories or products.
POST: Add a new category or product.
PUT: Update an existing category or product.
DELETE: Remove a category or product.
SEARCH: Apply filters to find specific products.

# Future Enhancement
Deploy application to a cloud platform like AWS

# Conclusion
This project demonstrates the complete lifecycle of developing a backend API for an E-commerce platform, from database design to deployment.  