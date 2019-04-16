package day1104;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("ÊäÈë×Ö·û´®");
		String s = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> map = tongJi(s);
		System.out.println(map);
		
	}

	private static HashMap<Character, Integer> tongJi(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length();i++) {
			char c = s.charAt(i);
			Integer count = map.get(c);
			if (count == null) {
				map.put(c, 1);
			}
			else {
				map.put(c, ++count);
			}
		}
		return map;
	}
}
