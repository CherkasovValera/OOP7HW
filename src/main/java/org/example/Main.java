package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.controllers.BookController;
import org.example.model.*;
import org.example.views.ViewBook;

public class Main {
    static final Logger rootLogger = LogManager.getRootLogger();
    public static void main(String[] args) {
//        FileOperation fileOperation = new FileOperImp("books.txt");
//        Library library = new LibraryFile(fileOperation);
//        BookController controller = new BookController(library);
//        ViewBook view = new ViewBook(controller);
//        view.run();
        rootLogger.info("Капец!");
    }
}
