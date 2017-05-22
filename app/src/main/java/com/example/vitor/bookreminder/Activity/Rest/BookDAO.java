package com.example.vitor.bookreminder.Activity.Rest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.vitor.bookreminder.Activity.Model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitor on 22/05/2017.
 */

public class BookDAO extends SQLiteOpenHelper {
    private static final String DATABASE = "Book Data Base";
    private static final int VERSION = 1;

    public BookDAO(Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Book (id INTEGER PRIMARY KEY, BookName TEXT NOT NULL, NumberPages INT NOT NULL)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Book";
        db.execSQL(sql);
        this.onCreate(db);
    }

    public void Insert (Book book){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues =  new ContentValues();
        contentValues.put("id", book.getId());
        contentValues.put("BookName", book.getNameBook());
        contentValues.put("NumberPages", book.getNumberPages());
        db.insert("Book", null, contentValues);
    }

    public List<Book> getBooks(){
        String sql =  "SELECT * FROM Book";
        SQLiteDatabase db = getReadableDatabase();
        Cursor c =  db.rawQuery(sql, null);
        List<Book> books = new ArrayList<Book>();
        while (c.moveToNext()){
            Book book =  new Book();
            book.setId(c.getInt(c.getColumnIndex("id")));
            book.setNameBook(c.getString(c.getColumnIndex("BookName")));
            book.setNumberPages(c.getInt(c.getColumnIndex("NumberPages")));
            books.add(book);
        }
        c.close();
        return books;
    }
}
