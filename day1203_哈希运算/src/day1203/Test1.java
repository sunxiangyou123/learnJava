package day1203;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(1,3);
		Point b = new Point(1,3);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		HashMap<Point, String> map = new HashMap<>();
		map.put(a,"3.9亿");
		map.put(b, "2亿");
		System.out.println(map);
	}
}
