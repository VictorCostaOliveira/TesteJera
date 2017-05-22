package com.example.vitor.bookreminder.Activity.Rest;

import android.widget.EditText;

import com.example.vitor.bookreminder.Activity.Activity.MainActivity;
import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.R;

/**
 * Created by vitor on 22/05/2017.
 */

public class Helper {
    private Book book;
    private MainActivity mainActivity;

    private EditText editTextNewBookName;
    private EditText editTextPageNumber;

    public Helper(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        book = new Book();
        loadingComponents();
    }

    private void loadingComponents() {
        editTextNewBookName = (EditText) mainActivity.findViewById(R.id.editTextBookName);
        editTextPageNumber = (EditText) mainActivity.findViewById(R.id.editTextNumberPages);
    }


    public Book takeBook() {
        book.setNameBook(editTextNewBookName.getText().toString());
        book.setNumberPages(editTextPageNumber.getText().toString());

        return book;
    }
}
