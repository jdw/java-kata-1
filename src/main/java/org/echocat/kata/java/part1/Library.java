package org.echocat.kata.java.part1;

import org.echocat.kata.java.part1.items.Base;
import org.echocat.kata.java.part1.items.Book;
import org.echocat.kata.java.part1.utils.Parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void search(String what, String value) {
        if (what.equals("isbn")) {
            for (Book b: books) {
                if (b.getIsbn().equals(value))
                    System.out.println(b);
            }
        }
    }

    public void populate(Base.Type type, File source) {
       switch (type) {
           case BOOK: populateBooks(source); break;
       }
    }

    private void populateBooks(File file) {
        try {
            Parser p = Parser.create(file);

            Book b = p.createBook();
            while (null != b) {
                books.add(b);
                b = p.createBook();
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
