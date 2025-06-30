# h-store-springboot-Backend

<img src = https://github.com/user-attachments/assets/89085659-b828-408c-b866-5f24dc629050/>

* Developed this REST API for an online shopping application. This API performs all the fundamental CRUD operations of any e-commerce platform with user validation at every step.

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

## Modules

* Login, Logout Module
* Seller Module
* Customer Module
* Product Module
* Cart Module
* Order Module

## Features

* Customer and Seller authentication & validation with session token.
* Seller Features:
    * Administrator Role of the entire application
    * Only registered seller with valid session token can add/update/delete products from main database
    * Seller can access the details of different customers, orders
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing different products and adding them to cart and placing orders
    * Only logged in user can access his orders, cart and other features.

