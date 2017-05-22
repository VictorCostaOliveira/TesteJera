package com.example.vitor.bookreminder.Activity.Model;

/**
 * Created by vitor on 22/05/2017.
 */

public class Book {

    private int id;
    private String nameBook;
    private String numberPages;

    public Book() {

    }

    public Book(int id, String nameBook, String numberPages) {
        this.id = id;
        this.nameBook = nameBook;
        this.numberPages = numberPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return nameBook;
    }
}
