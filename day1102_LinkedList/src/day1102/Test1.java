package day1102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<>();
		long t ;
		t = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l.add(1);
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n------------------------------");
		t = System.currentTimeMillis();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n----------------------------------");
		t = System.currentTimeMillis();
		System.out.println(l.get(5000));
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n------下标遍历--------------------------");
		t = System.currentTimeMillis();
		for (int i = 0; i < l.size(); i++) {
			l.get(i);
			
		}
		System.out.println(System.currentTimeMillis() - t);
		System.out.println("\n------迭代遍历");
		t = System.currentTimeMillis();
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			it.next();
		}
		System.out.println(System.currentTimeMillis()-t);
	}
}
