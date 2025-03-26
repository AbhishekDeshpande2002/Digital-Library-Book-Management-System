package com.library;


//Book class representing a book in the library
class Book {
 private final String bookId;
 private String title;
 private String author;
 private String genre;
 private String availability;

 public Book(String bookId, String title, String author, String genre, String availability) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.availability = availability;
 }

 public String getBookId() {
     return bookId;
 }

 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public String getGenre() {
     return genre;
 }

 public String getAvailability() {
     return availability;
 }

 public void setAvailability(String availability) {
     this.availability = availability;
 }

 @Override
 public String toString() {
     return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Availability: " + availability;
 }
}
