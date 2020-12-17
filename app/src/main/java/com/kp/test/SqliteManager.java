package com.kp.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static androidx.room.ColumnInfo.TEXT;

public class SqliteManager extends SQLiteOpenHelper implements AppConstants {
    //public static final String DATABASE_NAME = "test.db";
    public static final int version = 1;

    public SqliteManager(Context context) {
        super(context, DATABASE_NAME, null, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dbQuery = "CREATE TABLE TABLENAME (ID INTEGER PRIMARY KEY  AUTOINCREMENT,NAME TEXT, CONTACTEMAIL TEXT,PHOTO TEXT, PROFILELINK TEXT)";
        sqLiteDatabase.execSQL(dbQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    }
}