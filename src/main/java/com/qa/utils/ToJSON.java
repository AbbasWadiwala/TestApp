package com.qa.utils;

import java.util.Map;
import org.json.JSONObject;


public class ToJSON {
	public static void printMapToJSON(Map map) {
		System.out.println(new JSONObject(map));
	}
	
	public static void printOjectToJSON(Object account) {
		System.out.println(new JSONObject(account));
	}
}
