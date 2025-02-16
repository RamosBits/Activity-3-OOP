/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryManagement;

/**
 *
 * @author nicko
 */
public class LibraryTest {
    public static void main(String[] args) {
     
        Library library = new Library();

       
        Book book1 = new Book("Ready Player One", "Ernest Cline", 5);
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 3);
        Book book3 = new Book("One Piece Volume 1", "Eichero Oda", 4);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

       
        System.out.println("Before update:");
        library.displayLibrary();

     
        library.updateBookTitle(book1, "Ready Player One by Ernest Cline");

        // Task A Extension: Update the number of copies of book2
        library.updateBookCopies(book2, 10);
        
        library.updateBookCopies(book3, 2 );

        // Display library details after updates
        System.out.println("\nAfter updating book title and copies:");
        library.displayLibrary();

        // Task B: Demonstrate passing a primitive (int)
        int originalNumber = 123;
        System.out.println("\nOriginal number before method call: " + originalNumber);
        library.attemptPrimitiveChange(originalNumber);
        System.out.println("Original number after method call: " + originalNumber);
    }
}
