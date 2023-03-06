package com.example.designpatterns.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class AbstractFileReader {


    public final void read() throws IOException {
        String fileName = getFileName();
        readFileContent(fileName);
    }

    public String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the file name: ");
        return scanner.next();
    }

    public void readFileContent(String fileName) throws IOException {
        File file = new File("/Users/priya.j/personal_project/Design-patterns/src/main/resources/" + fileName);
        String path = String.valueOf(file.getAbsoluteFile());
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        displayContent(bufferedReader);
        bufferedReader.close();
        reader.close();
    }

    public abstract void displayContent(BufferedReader bufferedReader) throws IOException;
}
