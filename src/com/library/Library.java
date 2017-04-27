package com.library;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-27.
 */
public class Library {
    private Book book;
    List<Book> allBooks = new ArrayList<>();
    List<Book> borrowedBooks = new ArrayList<>();

    public Library(List<Book> aquiredBooks) {
        allBooks.addAll(aquiredBooks);
    }

    public void addBook(Book book) {
        allBooks.add(book);

    }

    private boolean isInLibrary(String title) {
        for (Book books : allBooks) {
            if (books.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    private boolean isBorrowed(String title) {
        for (Book books : borrowedBooks) {
            if (books.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public Book findBook(String title) {
        for (Book books : allBooks) {
            if (books.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        //check if is in library
        //assign object book
        //check if is borrowed
        Book book;
        if (isInLibrary(title)) {
            book = findBook(title);
            if (!isBorrowed(title)) {
                borrowedBooks.add(book);
            } else {
                System.out.println("This book has been borrowed");
            }
        } else {
            System.out.println("No such book in library");
        }
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
    }

    public void removeBook(String title) {
        for (Book books : allBooks) {
            if (books.getTitle().equals(title)) {
                allBooks.remove(books);
                break;
            }
        }
    }

    public void returnBook(String title) {
        Book returnedBook;
        returnedBook = findBook(title);
        borrowedBooks.remove(returnedBook);
    }

}

