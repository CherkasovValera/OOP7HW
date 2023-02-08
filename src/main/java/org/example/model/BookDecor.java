package org.example.model;

import java.util.List;

public class BookDecor implements Library {
    private Library lib;
    private Decorable decor;
    public BookDecor(Library library, Decorable decorable) {
        this.lib = library;
        this.decor = decorable;

    }
      @Override
    public List<Book> getAllBooks() {
          decor.SeeDecor(String.format("Создаем библиотеку %s",lib.getAllBooks()));
          return lib.getAllBooks();
    }

    @Override
    public String CreateBook(Book book) {
        decor.SeeDecor(String.format("Создаем библиотеку %s",lib.CreateBook(book)));
        return lib.CreateBook(book);
    }

    @Override
    public void updateBook(Book book) {
        System.out.println("C обновкой!");
    }

    @Override
    public void deleteByID(String inputId) {
        System.out.println("Долой!");
    }
}
