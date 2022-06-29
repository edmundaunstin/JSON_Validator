package Validate_Package;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Json_validate {
	public static <E> void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\EdmundAunstinG\\Downloads\\Application\\eclipse\\External Packages\\ShortJson.json"));
 
			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;
 
			String str=jsonObject.toString();
			
			/*
			 * JSONArray companyList = (JSONArray) jsonObject.get("Company List");
			 * Iterator<JSONObject> iterator = companyList.iterator(); while
			 * (iterator.hasNext()) { System.out.println(iterator.next()); }
			 */
			
			  Set arr=jsonObject.keySet();
			  Iterator<Set> iterator = arr.iterator();
			  while(iterator.hasNext()) {
				 
				  System.out.println(iterator.next());
				  }
			  
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

}
