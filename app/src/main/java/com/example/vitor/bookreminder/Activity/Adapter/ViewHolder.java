package com.example.vitor.bookreminder.Activity.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.vitor.bookreminder.R;

/**
 * Created by vitor on 22/05/2017.
 */

class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textViewNameBook;
    public TextView textViewBookPageNumbers;

    public ViewHolder(View itemView) {
        super(itemView);

        textViewNameBook = (TextView) itemView.findViewById(R.id.textViewNameBook);
        textViewBookPageNumbers = (TextView) itemView.findViewById(R.id.textViewBookNumberPages);
    }
}
