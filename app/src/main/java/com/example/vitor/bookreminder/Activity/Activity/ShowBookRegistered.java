package com.example.vitor.bookreminder.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.vitor.bookreminder.Activity.Adapter.Adapter;
import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.Activity.Rest.BookDAO;
import com.example.vitor.bookreminder.R;

import java.util.List;

public class ShowBookRegistered extends AppCompatActivity {
    private Button buttonCreatingNewBook;
    private RecyclerView recyclerView;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book_registered);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewBooks);

        BookDAO bookDAO = new BookDAO(this);
        List<Book> books = bookDAO.getBooks();
        bookDAO.close();

        adapter = new Adapter(books, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        buttonCreatingNewBook = (Button) findViewById(R.id.buttonCreatingNewBook);

        buttonCreatingNewBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowBookRegistered.this, MainActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {

        BookDAO bookDAO = new BookDAO(this);
        List<Book> books = bookDAO.getBooks();
        bookDAO.close();

        adapter.books = books;
        adapter.notifyDataSetChanged();
        super.onResume();
    }
}
