package day0504;

import java.util.Arrays;
import java.util.Random;

public class HomeWork {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int j = new Random().nextInt(7);
			
			while(a[j] == a[i]) {
				j++;
			}
			a[i] = a[j];
			
			
		}
		System.out.println(Arrays.toString(a));

	}

}
