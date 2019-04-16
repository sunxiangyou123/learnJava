package day0502;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		 int[] a = random();
		 System.out.println(Arrays.toString(a));
		 int index = f(a);
		 System.out.println("最小值为"+a[index]);
		 System.out.println("最小值下标为"+index);
	}

	private static int[] random() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(101);
			
		}
		return a;
	}

	private static int f(int[] a) {
		int m = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= m) {
				m = i;				
			}
		}
		return m;
	}
}
