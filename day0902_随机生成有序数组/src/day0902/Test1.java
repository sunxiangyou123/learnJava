package day0902;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("按回车执行");
		Number[] n = new Number[0];
		while(true) {
			new Scanner(System.in).nextLine();
			Number n1 = null;
			if (Math.random() < 0.5) {
				n1 = new Random().nextInt(1000);
			}
			else {
				double d = Math.random() * 1000;	
				d = BigDecimal.valueOf(d).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
				n1 = d;
			}
			int index = binarySearch(n, n1);
			if (index < 0) {
				index = -index -1;
			}
			n = Arrays.copyOf(n, n.length+1);
			System.arraycopy(n, index, n, index+1, n.length - index -1);
			n[index] = n1;
			System.out.println(Arrays.toString(n));
		}
	}

	private static int binarySearch(Number[] n, Number n1) {
		int lo = 0;
		int hi = n.length -1;
		int mid ;
		while(lo <= hi) {
			mid = (lo + hi)/2;
			if (n[mid].doubleValue() > n1.doubleValue()) {
				hi = mid - 1;
			}
			else if (n[mid].doubleValue() < n1.doubleValue()) {
				lo = mid +1;
			}else {
				return mid;
			}
		}
		return -(lo+1);
	}
}
