package com.library;

import java.util.Scanner;

//Main class to handle user interaction
public class DigitalLibrary {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Library library = new Library();

     while (true) {
         System.out.println("\nDigital Library Management System");
         System.out.println("1. Add Book");
         System.out.println("2. View All Books");
         System.out.println("3. Search Book");
         System.out.println("4. Update Book Details");
         System.out.println("5. Delete Book");
         System.out.println("6. Exit");
         System.out.print("Choose an option: ");
         
         int choice;
         try {
             choice = Integer.parseInt(scanner.nextLine());
         } catch (NumberFormatException e) {
             System.out.println("Invalid input. Please enter a number between 1-6.");
             continue;
         }
         
         switch (choice) {
             case 1:
                 System.out.print("Enter Book ID: ");
                 String id = scanner.nextLine();
                 System.out.print("Enter Title: ");
                 String title = scanner.nextLine();
                 System.out.print("Enter Author: ");
                 String author = scanner.nextLine();
                 System.out.print("Enter Genre: ");
                 String genre = scanner.nextLine();
                 System.out.print("Enter Availability (Available/Checked Out): ");
                 String availability = scanner.nextLine();
                 library.addBook(id, title, author, genre, availability);
                 break;
             case 2:
                 library.viewBooks();
                 break;
             case 3:
                 System.out.print("Enter Book ID or Title to search: ");
                 String searchKey = scanner.nextLine();
                 library.searchBook(searchKey);
                 break;
             case 4:
                 System.out.print("Enter Book ID to update: ");
                 String updateId = scanner.nextLine();
                 System.out.print("Enter new Title (leave blank to keep unchanged): ");
                 String newTitle = scanner.nextLine();
                 System.out.print("Enter new Author (leave blank to keep unchanged): ");
                 String newAuthor = scanner.nextLine();
                 System.out.print("Enter new Availability (Available/Checked Out, leave blank to keep unchanged): ");
                 String newAvailability = scanner.nextLine();
                 library.updateBook(updateId, newTitle, newAuthor, newAvailability);
                 break;
             case 5:
                 System.out.print("Enter Book ID to delete: ");
                 String deleteId = scanner.nextLine();
                 library.deleteBook(deleteId);
                 break;
             case 6:
                 System.out.println("Exiting system...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}