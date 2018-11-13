package com.qa.utils;

import java.util.Map;
import org.json.JSONObject;


public class ToJSON {
	public static String printMapToJSON(Map map) {
		return new JSONObject(map).toString();
	}
	
	public static String printOjectToJSON(Object account) {		
		return new JSONObject(account).toString();
	}
}
