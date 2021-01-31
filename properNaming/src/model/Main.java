package model;

import ui.webString;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        webString webString = new webString("https://jsoup.org/");
        System.out.println(webString.getHTML());
    }
}
