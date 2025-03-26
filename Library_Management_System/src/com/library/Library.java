package com.library;

import java.util.HashMap;
import java.util.Map;


//Library class to manage books
class Library {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(String bookId, String title, String author, String genre, String availability) {
        if (books.containsKey(bookId)) {
            System.out.println("Error: Book ID already exists.");
            return;
        }
        if (title.isEmpty() || author.isEmpty()) {
            System.out.println("Error: Title and Author cannot be empty.");
            return;
        }
        if (!availability.equalsIgnoreCase("Available") && !availability.equalsIgnoreCase("Checked Out")) {
            System.out.println("Error: Invalid availability status.");
            return;
        }
        books.put(bookId, new Book(bookId, title, author, genre, availability));
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        books.values().forEach(System.out::println);
    }

    public void searchBook(String searchKey) {
        for (Book book : books.values()) {
            if (book.getBookId().equalsIgnoreCase(searchKey) || book.getTitle().equalsIgnoreCase(searchKey)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void updateBook(String bookId, String newTitle, String newAuthor, String newAvailability) {
        if (!books.containsKey(bookId)) {
            System.out.println("Error: Book ID not found.");
            return;
        }
        Book book = books.get(bookId);
        if (!newTitle.isEmpty()) book.setTitle(newTitle);
        if (!newAuthor.isEmpty()) book.setAuthor(newAuthor);
        if (newAvailability.equalsIgnoreCase("Available") || newAvailability.equalsIgnoreCase("Checked Out")) {
            book.setAvailability(newAvailability);
        }
        System.out.println("Book details updated.");
    }

    public void deleteBook(String bookId) {
        if (books.remove(bookId) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Error: Book ID not found.");
        }
    }
}
