package day0806;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		int[] r = zbsz(33);
		int[] b = zbsz(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		int[] red = xuanRed(r);
		int blue = xuanBlue(b);
		System.out.println("红球：");
		System.out.println(Arrays.toString(red));
		System.out.println("蓝球：");
		System.out.println(blue);

	}

	private static int[] zbsz(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i +1;
		}
		return a;
	}

	private static int[] xuanRed(int[] a) {
		for (int i = 0; i < 6; i++) {
		int j = new Random().nextInt(33-i) + i;
		int t =a[i];
		a[i] =a[j];
		a[j] = t;
		
		}
		int[] b = Arrays.copyOf(a,6);
		Arrays.sort(b);
		return b;
	}

	private static int xuanBlue(int[] b) {
		
		return b[new Random().nextInt(16)];
	}

}

