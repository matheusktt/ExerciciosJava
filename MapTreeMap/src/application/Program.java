package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

//		inserir elemento no map
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");

		cookies.remove("email");
//		substitui a chave phone acima
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("ALL COOKIES:");
//		percorre o conjunto chamando os elementos 
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
