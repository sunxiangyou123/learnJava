package day0904;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("������");
	    int n = new Scanner(System.in).nextInt();
	    byte[] a = f1(n);
	    System.out.println(Arrays.toString(a));
	   
	    int r = f2(a);
	    System.out.println(r);
	}
	 
	private static int f2(byte[] a) {
	    /*
	     * 00101010
	     * 11111001
	     * 10111010
	     * 10111011
	     *
	     * r = 00101010 11111001 10111010 00000000
	     *
	     * ÿһ���ֽ�ֵ�Ⱥ�0x000000ff��λ�룬
	     * ������24,16,8,0λ
	     * �ٺ�r��λ�򣬽�����浽r
	     */
	    int r = 0;
	    for (int i = 0; i < a.length; i++) {
	        r = r | ((a[i]&0x000000ff)<<(24-8*i));    
	    }
	    return r;
	}
	 
	private static byte[] f1(int n) {
	    /*
	     * 00101010 11111001 10111010 10111011
	     *
	     * n����24,16,8,0����ǿתbyte
	     *    i 0  1  2 3
	     */
	    byte[] a = new byte[4];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = (byte) (n>>(24-8*i));
	    }
	    return a;

	}
}
