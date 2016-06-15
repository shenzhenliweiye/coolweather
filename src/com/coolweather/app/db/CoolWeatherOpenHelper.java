package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	/**
	 * ʡ�ݽ������
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement,"
			+ "prinvince_name text,"
			+ "prinvince_code text)";
	/**
	 * ���н������
	 */
  public static final String CREATE_CITY = "create table city("
		  + "id integer primary key autoincrement,"
		  + "city_name text,"
		  + "city_code text,"
		  + "province_id integer)";
  /**
   * �ؽ������
   */
  public static final String CREATE_COUNTY ="create table County ("
		  + "id integer primary key autoincrement,"
		  + "county_name text,"
		  + "county_code text,"
		  + "city_id integer)";
  public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version) {
	  super(context,name,factory,version);}
	  @Override
	   public void onCreate(SQLiteDatabase db) {
		  db.execSQL(CREATE_PROVINCE); //�������Եı�
		  db.execSQL(CREATE_CITY);
		  db.execSQL(CREATE_COUNTY);
		  
	  }
	  @Override
	  public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
	  {
		  
	  }
  }

