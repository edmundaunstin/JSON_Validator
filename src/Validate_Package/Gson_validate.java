package Validate_Package;




import java.io.FileReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class Gson_validate {
	public static <E> void main(String[] args) {
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\EdmundAunstinG\\Downloads\\Application\\eclipse\\External Packages\\ShortJson.json"));
 
			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JsonObject jsonObject = (JsonObject) obj;
			//Object o=obj.getClass().cast(obj);
			//System.out.println(o);
			String str=jsonObject.toString();
			JsonElement ele=(JsonElement)obj;
			
			
			/*
			 * JSONArray companyList = (JSONArray) jsonObject.get("Company List");
			 * Iterator<JSONObject> iterator = companyList.iterator(); while
			 * (iterator.hasNext()) { System.out.println(iterator.next()); }
			 */
			
			  Set arr=jsonObject.entrySet();
			  
			 // Boolean str1=jsonObject;
			 
			/*
			 * Iterator<Set> iterator = arr.iterator(); while(iterator.hasNext()) {
			 * 
			 * System.out.println(iterator.next()); }
			 */
			 System.out.println(jsonObject.size());
			 func(jsonObject);
			 			/*
			 * Collection<E> s=jsonObject.values(); Iterator<Collection<E>> iter =
			 * (Iterator<Collection<E>>) s.iterator(); while(iter.hasNext()) {
			 * if(iter.next()) System.out.println(iter.next()); }
			 */
			 
			
			
			
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void func(JsonObject jo) {
	 for (Map.Entry<String,JsonElement> entry : jo.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    if(value.getClass().getTypeName()=="com.google.gson.JsonArray")
		    {
		    	System.out.println(key+"="+value);
		    	//jsonObject.getAsJsonArray(value);
		    	//JsonArray array=(JsonArray)value;
		    	JsonElement array=(JsonElement)value;
		    	JsonObject obj1=array.
		    	System.out.println(obj1.getClass());
		    	func(obj1);
		    }
		    else
		    	System.out.println(key);
		  }

}

}
