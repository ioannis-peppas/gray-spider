package com.example.gray_spider_test0;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import org.jetbrains.annotations.NotNull;

public class MyDatabaseHelper extends SQLiteOpenHelper {


    private Context context;
    private static final String DATABASE_NAME = "Library.db";
    public static final int DATABASE_VERSION = 1;
    public final String TABLE_NAME  = "nodes_table";
    public final String COLUMN_ID = "_id";
    public final String COLUMN_GCHECK = "g_check";
    public final String COLUMN_UNDERSTANDING = "understanding";
    public final String COLUMN_TIME = "time";
    public final String COLUMN_MONEY = "money";
    public final String COLUMN_WORK = "work";
    public final String COLUMN_NETWORK = "network";
    public final String COLUMN_VOLTAGE = "voltage";
    @RequiresApi(api = Build.VERSION_CODES.P)
    public MyDatabaseHelper(@Nullable Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION  );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID     + " INTEGER PRIMARY KEY, " +
                COLUMN_GCHECK        + " INTEGER, " +
                COLUMN_UNDERSTANDING + " INTEGER, " +
                COLUMN_TIME          + " INTEGER, " +
                COLUMN_MONEY         + " INTEGER, " +
                COLUMN_WORK          + " INTEGER, " +
                COLUMN_NETWORK       + " INTEGER, " +
                COLUMN_VOLTAGE       + " INTEGER);" ;

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public void addNode (int numeral, int gcheck , int understanding,
                  int time , int money , int work, int network,
                  int voltage){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_ID , numeral );
        cv.put(COLUMN_GCHECK, gcheck );
        cv.put(COLUMN_UNDERSTANDING,understanding);
        cv.put(COLUMN_TIME,time);
        cv.put(COLUMN_MONEY,money);
        cv.put(COLUMN_WORK,work);
        cv.put(COLUMN_NETWORK,network);
        cv.put(COLUMN_VOLTAGE,voltage);

        long insert = db.insert(TABLE_NAME, null, cv);

        if( insert == -1 ) {
            // Print Numerical Exists!
        }else {
            // Print Saved!
        }
    }
}
