package org.echocat.kata.java.part1.utils;

import org.echocat.kata.java.part1.items.Author;
import org.echocat.kata.java.part1.items.Book;
import org.echocat.kata.java.part1.items.Magazine;

public interface ParserInterface {
    Author createAuthor() throws Exception;

    Book createBook() throws Exception;;

    Magazine createMagazine() throws Exception;;
}
