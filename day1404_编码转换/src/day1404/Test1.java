package day1404;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		String s = "abc中";
		System.out.println(s);
		f(s,"UTF-8");
		f(s,"GBK");
		f(s,null);
	}

	private static void f(String s, String charset) throws Exception {
		byte[] a ;
		if (charset == null) {
			a = s.getBytes();
		}else {
			a = s.getBytes(charset);
		}
		System.out.println(charset+"\t"+Arrays.toString(a));
		if (charset == null) {
			s = new String(a);
		}else {
			s = new String(a , charset);
		}
		System.out.println(s);
		System.out.println("-------------------");
	}
}
