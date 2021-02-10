package application;

import java.util.Map;
import java.util.TreeMap;

public class Program_Exemplo6 {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}
		
		cookies.remove("email");

		System.out.println();
		System.out.println("Not all Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}
		
		cookies.put("phone", "99711133"); //Ocorre um Overwrite
		System.out.println();
		System.out.println("Add new phone: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": "+ cookies.get(key));
		}
		
		System.out.println();
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Contains 'email' key: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
	}

}
