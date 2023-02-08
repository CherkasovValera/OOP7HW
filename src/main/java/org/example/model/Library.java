package org.example.model;

import java.util.List;

public interface Library {
    List<Book> getAllBooks();
    void addBookInList (Book book);

    String CreateBook(Book book);

    void updateBook (Book book);

    void deleteByID(String inputId);
}
