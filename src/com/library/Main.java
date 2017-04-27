package com.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz");
        Book book2 = new Book("Matrix");
        Book book3 = new Book("Ogniem i mieczem");

        List<Book> booksForLibrary = new ArrayList<>();
        booksForLibrary.add(book1);
        booksForLibrary.add(book2);
        booksForLibrary.add(book3);
        booksForLibrary.add(book2);
        Library library = new Library(booksForLibrary);
        //   library.addBook(book1);
        //  library.addBook(book2);
        //   library.addBook(book3);

        System.out.println(library.allBooks.size());
        Book borrowedBook1;
        Book borrowedBook2;
        Book borrowedBook3;
        borrowedBook1 = library.borrowBook("Matrix");
        System.out.println(library.borrowedBooks.size());
        borrowedBook2 = library.borrowBook("Matrix");
        System.out.println(library.borrowedBooks.size());
        library.returnBook(borrowedBook2);
        System.out.println(library.borrowedBooks.size());
        System.out.println(library.allBooks.size());
        borrowedBook3 = library.borrowBook("Ogniem i mieczem");
        System.out.println(library.borrowedBooks.size());

    }

}
