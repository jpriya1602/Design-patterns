package com.example.designpatterns.template;

import java.io.IOException;

public class FileReaderMain {
    public static void main(String[] args) {
        try {
            System.out.println("Reading CSV file");
            AbstractFileReader csvReader = new CSVReader();
            csvReader.read();

            System.out.println("Reading JSON file");
            JSONReader jsonReader = new JSONReader();
            jsonReader.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
