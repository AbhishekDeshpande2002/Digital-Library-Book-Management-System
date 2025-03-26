# Digital-Library-Book-Management-System

## Overview
This is a simple Library Management System implemented in Java. It allows librarians to:
- Add a new book (ensuring unique ID, non-empty title and author, and valid availability status).
- View all books.
- Search for a book by ID or title.
- Update book details.
- Delete a book from the catalog.
- Exit the system.

## Prerequisites
- Java Development Kit (JDK) 8 or later
- A Java-compatible terminal or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## Setup Instructions
1. **Clone the Repository (if applicable):**
   ```sh
   git clone <repository-url>
   cd <project-folder>
   ```

2. **Compile the Java Program:**
   ```sh
   javac DigitalLibrary.java
   ```

3. **Run the Program:**
   ```sh
   java DigitalLibrary
   ```

## Usage Instructions
1. Run the program and select an option from the menu.
2. Follow the prompts to add, search, update, or delete books.
3. To exit the system, select option 6.

## Assumptions
- Each book must have a unique ID.
- Title and Author fields cannot be empty.
- Availability must be either "Available" or "Checked Out".
- Books are stored in memory (no database integration yet).

## Future Enhancements
- Database integration for persistent storage.
- GUI or web-based interface.
- User authentication for access control.
