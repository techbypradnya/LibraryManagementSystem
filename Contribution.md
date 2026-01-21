# Library Management System

A console-based Library Management System developed in Java, implementing object-oriented programming principles and modular design.

---

## Team Members

### Team Member 1 – Model & Data Design Lead
**Name:** Pradnya Shailendra Pangavhane  
**PRN:** UEC23F1043

**Responsibilities:**
- Design and implement core data models
- Ensure proper encapsulation and constructors
- Add JavaDoc and comments for clarity

**Files Handled:**
- `library.model.Book.java`
- `library.model.Member.java`
- `library.model.IssueRecord.java`

**Key Contributions:**
- Defined attributes for Book, Member, and IssueRecord
- Implemented constructors, getters, setters, and toString() methods
- Ensured clean object-oriented design and encapsulation
- Added internal documentation using JavaDoc

---

### Team Member 2 – Service Layer & CRUD Operations Lead
**Name:** Bhagyashree Savata Mohalkar  
**PRN:** UEC23F1038

**Responsibilities:**
- Implement business logic
- Perform CRUD operations using Collections
- Handle search and validation logic

**Files Handled:**
- `library.service.BookService.java`
- `library.service.MemberService.java`

**Key Contributions:**
- Implemented Add, View, Delete, and Search operations
- Used ArrayList for in-memory data management
- Integrated exception throwing for invalid operations
- Ensured modular, reusable, and maintainable methods

---

### Team Member 3 – Issue/Return & Exception Handling Lead
**Name:** Shraddha Sunil Chavan  
**PRN:** UEC23F1009

**Responsibilities:**
- Manage book issue and availability logic
- Create and handle custom exceptions
- Ensure data consistency during issue operations

**Files Handled:**
- `library.service.IssueService.java`
- `library.exception.BookNotFoundException.java`
- `library.exception.MemberNotFoundException.java`
- `library.exception.BookNotAvailableException.java`

**Key Contributions:**
- Implemented book issuing functionality
- Dynamically updated book quantity
- Designed and handled custom exceptions for business rules
- Managed exceptional cases gracefully

---

### Team Member 4 – Main Application & Menu Integration Lead
**Name:** Chanchal Karna Chavhan  
**PRN:** UEC23F1010

**Responsibilities:**
- Develop menu-driven console flow
- Integrate all modules
- Handle user input and navigation logic

**Files Handled:**
- `library.main.LibraryApp.java`
- `library.util.InputUtil.java`

**Key Contributions:**
- Designed switch-case based menus
- Integrated Book, Member, and Issue services
- Managed user input using Scanner utility
- Implemented program loop, exit control, and centralized exception handling

---

## Project Structure

```
library/
├── model/
│   ├── Book.java
│   ├── Member.java
│   └── IssueRecord.java
├── service/
│   ├── BookService.java
│   ├── MemberService.java
│   └── IssueService.java
├── exception/
│   ├── BookNotFoundException.java
│   ├── MemberNotFoundException.java
│   └── BookNotAvailableException.java
├── util/
│   └── InputUtil.java
└── main/
    └── LibraryApp.java
```

---

## Features

- **Book Management:** Add, view, delete, and search books
- **Member Management:** Add, view, delete, and search members
- **Issue & Return System:** Issue books to members with availability tracking
- **Exception Handling:** Custom exceptions for business rule violations
- **Menu-Driven Interface:** Easy-to-use console-based navigation
- **In-Memory Data Storage:** ArrayList-based data management

---

## Technologies Used

- Java
- Collections Framework (ArrayList)
- Object-Oriented Programming
- Custom Exception Handling
- JavaDoc Documentation

---

## Module Details

### Model Layer
Contains data models representing library entities with proper encapsulation and JavaDoc documentation.

### Service Layer
Implements business logic and CRUD operations using ArrayList for data management.

### Exception Layer
Custom exceptions for handling specific business rule violations and error scenarios.

### Utility Layer
Helper classes for input handling and validation.

### Main Application
Menu-driven console interface integrating all modules with centralized exception handling.

---

## Development Approach

This project follows a modular, team-based development approach where each member owned specific components while ensuring seamless integration through well-defined interfaces and consistent coding standards.
