package com.example.vitor.bookreminder.Activity.Model;

/**
 * Created by vitor on 22/05/2017.
 */

public class Book {

    private String nameBook;
    private String numberPages;

    public Book() {

    }

    public Book(String nameBook, String numberPages) {

        this.nameBook = nameBook;
        this.numberPages = numberPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(String numberPages) {
        this.numberPages = numberPages;
    }


}
