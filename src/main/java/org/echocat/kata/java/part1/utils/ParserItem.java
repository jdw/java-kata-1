package org.echocat.kata.java.part1.utils;

import org.apache.commons.csv.CSVRecord;

public class ParserItem implements ParserItemInterface {
    public CSVRecord data = null;
    public String getValue(String key) {
        return data.get(key);
    }
}
