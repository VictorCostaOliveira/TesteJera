package com.example.vitor.bookreminder.Activity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.Activity.Rest.BookDAO;
import com.example.vitor.bookreminder.R;

import java.util.List;

public class ReminderActivity extends AppCompatActivity {
    private Button buttonSaveReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        BookDAO bookDAO = new BookDAO(this);
        List<Book> books = bookDAO.getBooks();
        bookDAO.close();

        Spinner dropdown = (Spinner) findViewById(R.id.spinnerBookOptions);
        ArrayAdapter<Book> adapter = new ArrayAdapter<Book>(this, R.layout.support_simple_spinner_dropdown_item, books);
        dropdown.setAdapter(adapter);

        buttonSaveReminder = (Button) findViewById(R.id.buttonNewReminder);
        buttonSaveReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
