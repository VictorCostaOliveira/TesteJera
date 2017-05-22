package com.example.vitor.bookreminder.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.Activity.Rest.BookDAO;
import com.example.vitor.bookreminder.Activity.Rest.Helper;
import com.example.vitor.bookreminder.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonSaveBook;
    private Helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        helper = new Helper(this);

        buttonSaveBook = (Button) findViewById(R.id.buttonSaveBook);

        buttonSaveBook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Book book = helper.takeBook();
                if (!book.getNameBook().equals("")) {
                    BookDAO bookDAO = new BookDAO(MainActivity.this);
                    bookDAO.Insert(book);
                    bookDAO.close();
                    Toast.makeText(MainActivity.this, "Livro salvo com sucesso", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, ShowBookRegistered.class));
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Titulo não pode ser nulo", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
