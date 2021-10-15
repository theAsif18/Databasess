package com.example.databaseoperation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBManage extends SQLiteOpenHelper {
    public static final String DbName="user.db";
    public DBManage(@Nullable Context context) {
        super(context, DbName, null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query="create table tblusers(id integer primary key autoincrement, name text, mobile text, email text, password text)";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
