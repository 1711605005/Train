package com.edu.gdpt.xxgcx.train.Sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HistorySQLite {
    private static final String CREATE_HISTORY=" create table history ("+" id integer primary key autoincrement, "+ " name text)";
    private final String TAG ="HistorySearchUtil";
    private final String TABLE_NAME="history";
    public Context context;
    private static HistorySQLite historySQLite;
    private DataBaseHelper dataBaseHelper;

    private HistorySQLite(Context context){
        dataBaseHelper=new DataBaseHelper(context,"Record.db",null,1);
        this.context=context;
    }
    public static HistorySQLite getInstance(Context context){//得到一个实例
        if (historySQLite == null){
            historySQLite=new HistorySQLite(context);
        }else if ((!historySQLite.context.getClass().equals(context.getClass()))){//判断两个context是否相同
            historySQLite=new HistorySQLite(context);
        }
        return historySQLite;
    }

    //添加一条新纪录
    public void putNewSearch(String name){
        SQLiteDatabase db=dataBaseHelper.getWritableDatabase();
        if (! isExist(name)){//判断新纪录是否存在，不存在则添加
            ContentValues values=new ContentValues();
            values.put("name",name);
            db.insert(TABLE_NAME,null,values);
        }
    }
    //判断记录是否存在
    private boolean isExist(String name) {
        SQLiteDatabase db=dataBaseHelper.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from "+ TABLE_NAME+" where name = ? ",new String[]{name});
        if (cursor.moveToFirst()){//如果存在
            return true;
        }else {
            return false;
        }
    }
    //查询所有记录
    public List<String> queryHistoryList(){
        SQLiteDatabase db=dataBaseHelper.getWritableDatabase();
        List<String> list=new ArrayList<String>();
        Cursor cursor=db.query(TABLE_NAME,null,null,null,null,null,null);
        if (cursor.moveToFirst()){
            do {
                String name=cursor.getString(cursor.getColumnIndex("name"));
                list.add(name);
            }while (cursor.moveToNext());
        }
        return list;
    }
    //删除单条记录
    public void deleteHistory(String name){
        SQLiteDatabase db=dataBaseHelper.getWritableDatabase();
        if (!isExist(name)){
            db.delete(TABLE_NAME," name = "+" '"+name+" '",null);
        }
    }
    //删除所有记录
    public void deleteAllHistory(){
        SQLiteDatabase db=dataBaseHelper.getWritableDatabase();
        db.delete(TABLE_NAME,null,null);
    }

    public class DataBaseHelper extends SQLiteOpenHelper {
        public DataBaseHelper(Context context,String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_HISTORY);//建表
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}
