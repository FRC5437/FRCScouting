/*
-----------------------------------------------------
StatsStructGen.py 1.1

This file was autogenerated with run cmd:
  "gen_scripts/StatsStructGen.py --packagename=org.frc836.database --classname=PitStats --tablename=scout_pit_data_2018 --infile=FRC_Scouting_Server/scouting.sql --outfile=app/src/main/java/org/frc836/database/PitStats.java"

python version info:
  3.4.2 (default, Oct  8 2014, 10:45:20) 
[GCC 4.9.1]

Please take heed of modifying unnecessarily
-----------------------------------------------------
*/

package org.frc836.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.frc836.database.FRCScoutingContract.SCOUT_PIT_DATA_2018_Entry;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Date;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PitStats {


	public int team_id;
	public boolean auto_run;
	public int auto_switch_count;
	public int auto_scale_count;
	public boolean switch_score;
	public boolean scale_score;
	public boolean exchange;
	public boolean climb;
	public boolean supports_others;
	public boolean floor_acquire;
	public boolean exchange_acquire;
	public boolean portal_acquire;
	public int max_robot_speed_fts;
	public int robot_gross_weight_lbs;
	public String config_id;
	public String wheel_base_id;
	public String wheel_type_id;
	public String notes;
	

	public static final String TABLE_NAME = SCOUT_PIT_DATA_2018_Entry.TABLE_NAME;
	public static final String COLUMN_NAME_ID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_ID;
	public static final String COLUMN_NAME_TEAM_ID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_TEAM_ID;
	public static final String COLUMN_NAME_AUTO_RUN = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_AUTO_RUN;
	public static final String COLUMN_NAME_AUTO_SWITCH_COUNT = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_AUTO_SWITCH_COUNT;
	public static final String COLUMN_NAME_AUTO_SCALE_COUNT = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_AUTO_SCALE_COUNT;
	public static final String COLUMN_NAME_SWITCH_SCORE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_SWITCH_SCORE;
	public static final String COLUMN_NAME_SCALE_SCORE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_SCALE_SCORE;
	public static final String COLUMN_NAME_EXCHANGE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_EXCHANGE;
	public static final String COLUMN_NAME_CLIMB = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_CLIMB;
	public static final String COLUMN_NAME_SUPPORTS_OTHERS = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_SUPPORTS_OTHERS;
	public static final String COLUMN_NAME_FLOOR_ACQUIRE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_FLOOR_ACQUIRE;
	public static final String COLUMN_NAME_EXCHANGE_ACQUIRE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_EXCHANGE_ACQUIRE;
	public static final String COLUMN_NAME_PORTAL_ACQUIRE = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_PORTAL_ACQUIRE;
	public static final String COLUMN_NAME_MAX_ROBOT_SPEED_FTS = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_MAX_ROBOT_SPEED_FTS;
	public static final String COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS;
	public static final String COLUMN_NAME_CONFIG_ID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_CONFIG_ID;
	public static final String COLUMN_NAME_WHEEL_BASE_ID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_WHEEL_BASE_ID;
	public static final String COLUMN_NAME_WHEEL_TYPE_ID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_WHEEL_TYPE_ID;
	public static final String COLUMN_NAME_NOTES = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_NOTES;
	public static final String COLUMN_NAME_INVALID = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_INVALID;
	public static final String COLUMN_NAME_TIMESTAMP = SCOUT_PIT_DATA_2018_Entry.COLUMN_NAME_TIMESTAMP;
	

	public PitStats() {
		init();
	}
	
	public void init() {
		team_id = 0;
		auto_run = false;
		auto_switch_count = 0;
		auto_scale_count = 0;
		switch_score = false;
		scale_score = false;
		exchange = false;
		climb = false;
		supports_others = false;
		floor_acquire = false;
		exchange_acquire = false;
		portal_acquire = false;
		max_robot_speed_fts = 0;
		robot_gross_weight_lbs = 0;
		config_id = "other";
		wheel_base_id = "other";
		wheel_type_id = "other";
		notes = "";
	}
	

	public ContentValues getValues(DB db, SQLiteDatabase database) {
		ContentValues vals = new ContentValues();
		vals.put(COLUMN_NAME_ID, team_id * team_id);
		vals.put(COLUMN_NAME_TEAM_ID, team_id);
		vals.put(COLUMN_NAME_AUTO_RUN, auto_run ? 1 : 0);
		vals.put(COLUMN_NAME_AUTO_SWITCH_COUNT, auto_switch_count);
		vals.put(COLUMN_NAME_AUTO_SCALE_COUNT, auto_scale_count);
		vals.put(COLUMN_NAME_SWITCH_SCORE, switch_score ? 1 : 0);
		vals.put(COLUMN_NAME_SCALE_SCORE, scale_score ? 1 : 0);
		vals.put(COLUMN_NAME_EXCHANGE, exchange ? 1 : 0);
		vals.put(COLUMN_NAME_CLIMB, climb ? 1 : 0);
		vals.put(COLUMN_NAME_SUPPORTS_OTHERS, supports_others ? 1 : 0);
		vals.put(COLUMN_NAME_FLOOR_ACQUIRE, floor_acquire ? 1 : 0);
		vals.put(COLUMN_NAME_EXCHANGE_ACQUIRE, exchange_acquire ? 1 : 0);
		vals.put(COLUMN_NAME_PORTAL_ACQUIRE, portal_acquire ? 1 : 0);
		vals.put(COLUMN_NAME_MAX_ROBOT_SPEED_FTS, max_robot_speed_fts);
		vals.put(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS, robot_gross_weight_lbs);
		vals.put(COLUMN_NAME_CONFIG_ID, db.getConfigIDFromName(config_id, database));
		vals.put(COLUMN_NAME_WHEEL_BASE_ID, db.getWheelBaseIDFromName(wheel_base_id, database));
		vals.put(COLUMN_NAME_WHEEL_TYPE_ID, db.getWheelTypeIDFromName(wheel_type_id, database));
		vals.put(COLUMN_NAME_NOTES, notes);
		vals.put(COLUMN_NAME_INVALID, 1);
	
		return vals;
	}

	public void fromCursor(Cursor c, DB db, SQLiteDatabase database) {
		fromCursor(c, db, database, 0);
	}
	
	public void fromCursor(Cursor c, DB db, SQLiteDatabase database, int pos) {
		c.moveToPosition(pos);
		team_id = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_TEAM_ID));
		auto_run = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_RUN)) != 0;
		auto_switch_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SWITCH_COUNT));
		auto_scale_count = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_AUTO_SCALE_COUNT));
		switch_score = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SWITCH_SCORE)) != 0;
		scale_score = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SCALE_SCORE)) != 0;
		exchange = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_EXCHANGE)) != 0;
		climb = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CLIMB)) != 0;
		supports_others = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_SUPPORTS_OTHERS)) != 0;
		floor_acquire = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_FLOOR_ACQUIRE)) != 0;
		exchange_acquire = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_EXCHANGE_ACQUIRE)) != 0;
		portal_acquire = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_PORTAL_ACQUIRE)) != 0;
		max_robot_speed_fts = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_MAX_ROBOT_SPEED_FTS));
		robot_gross_weight_lbs = c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS));
		config_id = DB.getConfigNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_CONFIG_ID)), database);
		wheel_base_id = DB.getWheelBaseNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_WHEEL_BASE_ID)), database);
		wheel_type_id = DB.getWheelTypeNameFromID(c.getInt(c.getColumnIndexOrThrow(COLUMN_NAME_WHEEL_TYPE_ID)), database);
		notes = c.getString(c.getColumnIndexOrThrow(COLUMN_NAME_NOTES));
	}

	public String[] getProjection() {
		List<String> temp = new ArrayList<String>(18);
		temp.add(COLUMN_NAME_TEAM_ID);
		temp.add(COLUMN_NAME_AUTO_RUN);
		temp.add(COLUMN_NAME_AUTO_SWITCH_COUNT);
		temp.add(COLUMN_NAME_AUTO_SCALE_COUNT);
		temp.add(COLUMN_NAME_SWITCH_SCORE);
		temp.add(COLUMN_NAME_SCALE_SCORE);
		temp.add(COLUMN_NAME_EXCHANGE);
		temp.add(COLUMN_NAME_CLIMB);
		temp.add(COLUMN_NAME_SUPPORTS_OTHERS);
		temp.add(COLUMN_NAME_FLOOR_ACQUIRE);
		temp.add(COLUMN_NAME_EXCHANGE_ACQUIRE);
		temp.add(COLUMN_NAME_PORTAL_ACQUIRE);
		temp.add(COLUMN_NAME_MAX_ROBOT_SPEED_FTS);
		temp.add(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS);
		temp.add(COLUMN_NAME_CONFIG_ID);
		temp.add(COLUMN_NAME_WHEEL_BASE_ID);
		temp.add(COLUMN_NAME_WHEEL_TYPE_ID);
		temp.add(COLUMN_NAME_NOTES);
		String[] projection = new String[temp.size()];
		return temp.toArray(projection);
	}

	public boolean isTextField(String column_name) {
		if (COLUMN_NAME_NOTES.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public boolean needsConvertedToText(String column_name) {
		if (COLUMN_NAME_CONFIG_ID.equalsIgnoreCase(column_name)) return true;
	
		if (COLUMN_NAME_WHEEL_BASE_ID.equalsIgnoreCase(column_name)) return true;
	
		if (COLUMN_NAME_WHEEL_TYPE_ID.equalsIgnoreCase(column_name)) return true;
	
		return false;
	}

	public ContentValues jsonToCV(JSONObject json) throws JSONException {
		ContentValues vals = new ContentValues();
		vals.put(COLUMN_NAME_ID, json.has(COLUMN_NAME_ID) ? json.getInt(COLUMN_NAME_ID) : 0);
		vals.put(COLUMN_NAME_TEAM_ID, json.has(COLUMN_NAME_TEAM_ID) ? json.getInt(COLUMN_NAME_TEAM_ID) : 0);
		vals.put(COLUMN_NAME_AUTO_RUN, json.has(COLUMN_NAME_AUTO_RUN) ? json.getInt(COLUMN_NAME_AUTO_RUN) : 0);
		vals.put(COLUMN_NAME_AUTO_SWITCH_COUNT, json.has(COLUMN_NAME_AUTO_SWITCH_COUNT) ? json.getInt(COLUMN_NAME_AUTO_SWITCH_COUNT) : 0);
		vals.put(COLUMN_NAME_AUTO_SCALE_COUNT, json.has(COLUMN_NAME_AUTO_SCALE_COUNT) ? json.getInt(COLUMN_NAME_AUTO_SCALE_COUNT) : 0);
		vals.put(COLUMN_NAME_SWITCH_SCORE, json.has(COLUMN_NAME_SWITCH_SCORE) ? json.getInt(COLUMN_NAME_SWITCH_SCORE) : 0);
		vals.put(COLUMN_NAME_SCALE_SCORE, json.has(COLUMN_NAME_SCALE_SCORE) ? json.getInt(COLUMN_NAME_SCALE_SCORE) : 0);
		vals.put(COLUMN_NAME_EXCHANGE, json.has(COLUMN_NAME_EXCHANGE) ? json.getInt(COLUMN_NAME_EXCHANGE) : 0);
		vals.put(COLUMN_NAME_CLIMB, json.has(COLUMN_NAME_CLIMB) ? json.getInt(COLUMN_NAME_CLIMB) : 0);
		vals.put(COLUMN_NAME_SUPPORTS_OTHERS, json.has(COLUMN_NAME_SUPPORTS_OTHERS) ? json.getInt(COLUMN_NAME_SUPPORTS_OTHERS) : 0);
		vals.put(COLUMN_NAME_FLOOR_ACQUIRE, json.has(COLUMN_NAME_FLOOR_ACQUIRE) ? json.getInt(COLUMN_NAME_FLOOR_ACQUIRE) : 0);
		vals.put(COLUMN_NAME_EXCHANGE_ACQUIRE, json.has(COLUMN_NAME_EXCHANGE_ACQUIRE) ? json.getInt(COLUMN_NAME_EXCHANGE_ACQUIRE) : 0);
		vals.put(COLUMN_NAME_PORTAL_ACQUIRE, json.has(COLUMN_NAME_PORTAL_ACQUIRE) ? json.getInt(COLUMN_NAME_PORTAL_ACQUIRE) : 0);
		vals.put(COLUMN_NAME_MAX_ROBOT_SPEED_FTS, json.has(COLUMN_NAME_MAX_ROBOT_SPEED_FTS) ? json.getInt(COLUMN_NAME_MAX_ROBOT_SPEED_FTS) : 0);
		vals.put(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS, json.has(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS) ? json.getInt(COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS) : 0);
		vals.put(COLUMN_NAME_CONFIG_ID, json.has(COLUMN_NAME_CONFIG_ID) ? json.getInt(COLUMN_NAME_CONFIG_ID) : 0);
		vals.put(COLUMN_NAME_WHEEL_BASE_ID, json.has(COLUMN_NAME_WHEEL_BASE_ID) ? json.getInt(COLUMN_NAME_WHEEL_BASE_ID) : 0);
		vals.put(COLUMN_NAME_WHEEL_TYPE_ID, json.has(COLUMN_NAME_WHEEL_TYPE_ID) ? json.getInt(COLUMN_NAME_WHEEL_TYPE_ID) : 0);
		vals.put(COLUMN_NAME_NOTES, json.has(COLUMN_NAME_NOTES) ? json.getString(COLUMN_NAME_NOTES) : "");
		vals.put(COLUMN_NAME_INVALID, 0);
		vals.put(COLUMN_NAME_TIMESTAMP, DB.dateParser.format(new Date(json.getLong(COLUMN_NAME_TIMESTAMP) * 1000)));
		return vals;
	}

	public LinkedHashMap<String,String> getDisplayData() {
		LinkedHashMap<String,String> vals = new LinkedHashMap<String,String>();
		vals.put( COLUMN_NAME_TEAM_ID, String.valueOf(team_id));
		vals.put( COLUMN_NAME_AUTO_RUN, String.valueOf(auto_run ? 1 : 0));
		vals.put( COLUMN_NAME_AUTO_SWITCH_COUNT, String.valueOf(auto_switch_count));
		vals.put( COLUMN_NAME_AUTO_SCALE_COUNT, String.valueOf(auto_scale_count));
		vals.put( COLUMN_NAME_SWITCH_SCORE, String.valueOf(switch_score ? 1 : 0));
		vals.put( COLUMN_NAME_SCALE_SCORE, String.valueOf(scale_score ? 1 : 0));
		vals.put( COLUMN_NAME_EXCHANGE, String.valueOf(exchange ? 1 : 0));
		vals.put( COLUMN_NAME_CLIMB, String.valueOf(climb ? 1 : 0));
		vals.put( COLUMN_NAME_SUPPORTS_OTHERS, String.valueOf(supports_others ? 1 : 0));
		vals.put( COLUMN_NAME_FLOOR_ACQUIRE, String.valueOf(floor_acquire ? 1 : 0));
		vals.put( COLUMN_NAME_EXCHANGE_ACQUIRE, String.valueOf(exchange_acquire ? 1 : 0));
		vals.put( COLUMN_NAME_PORTAL_ACQUIRE, String.valueOf(portal_acquire ? 1 : 0));
		vals.put( COLUMN_NAME_MAX_ROBOT_SPEED_FTS, String.valueOf(max_robot_speed_fts));
		vals.put( COLUMN_NAME_ROBOT_GROSS_WEIGHT_LBS, String.valueOf(robot_gross_weight_lbs));
		vals.put( COLUMN_NAME_CONFIG_ID, config_id);
		vals.put( COLUMN_NAME_WHEEL_BASE_ID, wheel_base_id);
		vals.put( COLUMN_NAME_WHEEL_TYPE_ID, wheel_type_id);
		vals.put( COLUMN_NAME_NOTES, notes);
		return vals;
	}

}