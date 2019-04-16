package day1103;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("求第几个丑数");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}
	//低效率方法
	private static long g(int n) {
		 if (n == 1) {
			return 1;
		}
		 int count =1;
		 for(long i =2 ; ; i++) {
			 long j = i;
			 while(j%2 == 0) j /=2;
			 while(j%3 == 0) j /=3;
			 while(j%5 == 0) j /=5;
			 if (j == 1) {
				count++;
				if (count == n) {
					return i;
				}
			}
		 }
	}
	
	private static long f(int n) {
		if (n == 1) {
			return 1;
		}
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>();
		list2.add(2L);
		list3.add(3L);
		list5.add(5L);
		long r = 0;
		for (int i = 2; i <= n; i++) {
			long x = list2.getFirst();
			long y = list3.getFirst();
			long z = list5.getFirst();
			r = Math.min(z , Math.min(x,y));
			if (r == x) {
				list2.removeFirst();
			}
			if (r == y) {
				list3.removeFirst();
			}
			if (r == z) {
				list5.removeFirst();
			}
			list2.add(r * 2);
			list3.add(r * 3);
			list5.add(r * 5);
		}
		return r;
	}
}

