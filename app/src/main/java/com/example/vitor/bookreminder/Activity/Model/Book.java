package com.example.vitor.bookreminder.Activity.Model;

/**
 * Created by vitor on 22/05/2017.
 */

public class Book {
    private int id;
    private String nameBook;
    private int numberPages;

    public Book(){

    }

    public Book(int id, String nameBook, int numberPages) {
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

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
}
