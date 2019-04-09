package day0504;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			
		}
		System.out.println(Arrays.toString(a));
			shuffle(a);
			
		}

	private static void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int j = new Random().nextInt(a.length);
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		System.out.println(Arrays.toString(a));
	}
		

	}


