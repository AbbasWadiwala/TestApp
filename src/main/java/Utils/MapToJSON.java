package Utils;


import java.util.Map;
import org.json.JSONObject;


public class MapToJSON {
	public static void printMapToJSON(Map map) {
		System.out.println(new JSONObject(map));
	}
}
