package org.echocat.kata.java.part1.items;

import org.echocat.kata.java.part1.utils.ParserItem;

public class Book {
    private String isbn;
    private String title;
    private String authors;
    private String description;


    public Book() {

    }

    public static Book create(ParserItem pi) {
        Book ret = new Book();
        ret.isbn = pi.getValue("\uFEFFtitle");
        ret.isbn = pi.getValue("isbn");
        ret.isbn = pi.getValue("authors");
        ret.isbn = pi.getValue("description");

        return ret;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String toString() {
        return "Book: "
                + this.title + ", "
                + this.isbn + ", "
                + this.authors + ", "
                + this.description + ", "
                ;
    }
}


