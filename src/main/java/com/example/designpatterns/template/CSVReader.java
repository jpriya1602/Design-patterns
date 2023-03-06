package com.example.designpatterns.template;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;

public class CSVReader extends AbstractFileReader {
    @Override
    public void displayContent(BufferedReader bufferedReader) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] fields = line.split(",");
            System.out.println(fields[0] + " " + fields[1]);
        }
    }
}
