package org.echocat.kata.java.part1.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.items.Author;
import org.echocat.kata.java.part1.items.Book;
import org.echocat.kata.java.part1.items.Magazine;

import java.io.*;

public class Parser implements ParserInterface {
    private CSVParser csvParser = null;

    public Book createBook() throws IOException {
        if (!csvParser.iterator().hasNext()) {
            csvParser.close();
            return null;
        }

        CSVRecord rec = csvParser.iterator().next();


        ParserItem pi = new ParserItem();
        pi.data = rec;
        return Book.create(pi);
    }

    public Magazine createMagazine() throws IOException {
        return null;
    }

    public Author createAuthor() throws IOException {
        return null;
    }

    public static Parser create(File source) throws IOException {
        Reader in = new FileReader(source);
        Parser ret = new Parser();
        ret.csvParser = CSVFormat.DEFAULT.withDelimiter(';').withHeader().parse(in);

        return ret;
    }
}
