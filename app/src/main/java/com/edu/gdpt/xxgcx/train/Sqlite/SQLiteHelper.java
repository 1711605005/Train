package com.edu.gdpt.xxgcx.train.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static int DB_VERSION=1;
    public static String DB_NAME="train.db";
    public static  String U_USERINFO="userinfo";//用户信息

    public SQLiteHelper(Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS "+U_USERINFO+"( "
        + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
        + "userName VARCHAR,"
        + "password VARCHAR,"
        + "nickName VARCHAR,"
        + "sex VARCHAR,"
        + "head VARCHAR "
        + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ U_USERINFO);
        onCreate(db);
    }
}
