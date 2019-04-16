package day1101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import org.omg.PortableInterceptor.Interceptor;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> l =new ArrayList<>();
		System.out.println("输入回车执行,q停止");
		while(true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("q")) {
				break;
			}
			int r = new Random().nextInt(100);
			int index = Collections.binarySearch(l, r);
			if (index < 0) {
				index = -index -1;
			}
			l.add(index,r);
			System.out.println(l);
		}
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
		}
	}
}
