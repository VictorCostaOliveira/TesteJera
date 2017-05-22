package com.example.vitor.bookreminder.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.Activity.Rest.BookDAO;
import com.example.vitor.bookreminder.Activity.Rest.Helper;
import com.example.vitor.bookreminder.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button buttonSaveBook;
    private Book book = new Book();
    private Helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new Helper(book, this);

        buttonSaveBook = (Button) findViewById(R.id.buttonSaveBook);

        buttonSaveBook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                book = helper.getNewBook();
                if (!book.getNameBook().equals(null)) {
                    BookDAO bookDAO = new BookDAO(MainActivity.this);
                    bookDAO.Insert(book);
                    bookDAO.close();
                    Toast.makeText(MainActivity.this, "Livro salvo com sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Nome do livro não pode ser vazio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
