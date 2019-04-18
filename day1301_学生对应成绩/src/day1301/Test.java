package day1301;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(9527,"唐伯虎","男",18);
		Student s2 = new Student(9527,"唐伯虎","男",18);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		HashMap<Student, Integer> map = new HashMap<>();
		map.put(s1, 98);
		map.put(s2, 98);
		System.out.println(map);
	}
}
