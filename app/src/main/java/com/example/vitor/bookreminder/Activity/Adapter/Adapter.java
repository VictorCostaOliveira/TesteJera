package com.example.vitor.bookreminder.Activity.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vitor.bookreminder.Activity.Model.Book;
import com.example.vitor.bookreminder.R;

import java.util.List;

/**
 * Created by vitor on 22/05/2017.
 */

public class Adapter extends RecyclerView.Adapter {

    public List<Book> books;
    public Context context;

    public Adapter(List<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.show_registered_books, parent, false);
        ViewHolder holder =  new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        final Book book = books.get(position);
        holder.textViewNameBook.setText("Titulo: " + book.getNameBook());
        holder.textViewBookPageNumbers.setText("Paginas: " + book.getNumberPages());

    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
