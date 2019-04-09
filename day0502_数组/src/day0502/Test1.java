package day0502;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("\n--------------------------");
		f1();
		System.out.println("\n--------------------------");
		f2();
		System.out.println("\n--------------------------");
		f3();
}

	private static void f1() {
		String[] a = new String[5];
		System.out.println(Arrays.toString(a));
		a[3] = "abc";
		System.out.println(Arrays.toString(a));
		
	}

	private static void f2() {
		int[] a = {6,1,2,7,3,5,9};
		System.out.println(Arrays.toString(a));
		a = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(a));
	}

	private static void f3() {
		int[] a = new int[5];
		a[2] = 565;
		System.out.println(a[2]);
		System.out.println(a[2]*2);
		a[2]++;
		int t = a[2];
		a[2] = a[3];
		a[3] = t;
		System.out.println(Arrays.toString(a));
		
		
	}
}
