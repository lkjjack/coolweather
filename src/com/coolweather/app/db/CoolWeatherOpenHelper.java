package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

	/**
	 * Province�������
	 */
	public static final String CREATE_PROVINCE = "CREATE TABLE `province` ("
			+ "`id` int(11) NOT NULL AUTO_INCREMENT,"
			+ "`province_name` text,"
			+ " `province_code` text,"
			+ " PRIMARY KEY (`id`)"
			+ ") ENGINE=MyISAM DEFAULT CHARSET=utf8;";
	
	/**
	 * City�������
	 */
	public static final String CREATE_CITY = "CREATE TABLE `city` ("
			+ "`id` int(11) NOT NULL AUTO_INCREMENT,"
			+ "`city_name` text,"
			+ "`city_code` text,"
			+ "`province_id` int(11) DEFAULT NULL,"
			+ "PRIMARY KEY (`id`)"
			+ ") ENGINE=MyISAM DEFAULT CHARSET=utf8;";
	
	/**
	 * County�������
	 */
	public static final String CREATE_COUNTY = "CREATE TABLE `county` ("
			 + "`id` int(11) NOT NULL AUTO_INCREMENT,"
			 + "`county_name` text,"
			 + "`county_code` text,"
			 + "`city_id` int(11) DEFAULT NULL,"
			 + "PRIMARY KEY (`id`)"
			 + ") ENGINE=MyISAM DEFAULT CHARSET=utf8;";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVINCE); //����Province�� 
		db.execSQL(CREATE_CITY);  //����City��
		db.execSQL(CREATE_COUNTY);  //����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
