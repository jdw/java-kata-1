package org.echocat.kata.java.part1;

import org.echocat.kata.java.part1.items.Base;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;


public class MainApp {
    private void run() throws Exception {
        HashMap<Base.Type, File> typeToFile = new HashMap<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        File books = new File(classloader.getResource("org/echocat/kata/java/part1/data/books.csv").getFile());

        //typeToFile.put(Base.Type.MAGAZINE, new File("magazines.csv"));
        //typeToFile.put(Base.Type.AUTHOR, new File("authors.csv"));

        Library l = new Library();
        l.populate(Base.Type.BOOK, books);
        l.search("isbn", "5554-5545-4518");
    }

    public static void main(String[] args) {
        MainApp ma = new MainApp();
        try {
            ma.run();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(getHelloWorldText());
    }

    protected static String getHelloWorldText() {
        return "Hello world!";
    }

}
