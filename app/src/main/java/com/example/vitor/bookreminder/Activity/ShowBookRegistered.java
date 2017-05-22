package com.example.vitor.bookreminder.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vitor.bookreminder.R;

public class ShowBookRegistered extends AppCompatActivity {
    private Button buttonCreatingNewBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book_registered);

        buttonCreatingNewBook = (Button) findViewById(R.id.buttonCreatingNewBook);

        buttonCreatingNewBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowBookRegistered.this, MainActivity.class));
            }
        });

    }
}
