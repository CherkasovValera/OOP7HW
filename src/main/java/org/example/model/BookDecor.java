package org.example.model;

import java.util.List;

public class BookDecor implements Library{
    private Library lib;

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void addBookInList(Book book) {

    }

    @Override
    public String CreateBook(Book book) {
        return null;
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void deleteByID(String inputId) {

    }
}
