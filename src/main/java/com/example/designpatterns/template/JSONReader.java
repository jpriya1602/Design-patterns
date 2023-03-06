package com.example.designpatterns.template;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;

public class JSONReader extends AbstractFileReader {
    @Override
    public void displayContent(BufferedReader bufferedReader) throws IOException {
        Gson gson = new Gson();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            User user = gson.fromJson(line, User.class);
            System.out.println(user.getMailId() + " " + user.getValue());
        }
    }
}
