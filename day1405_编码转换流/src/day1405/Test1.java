package day1405;

import java.io.FileInputStream;

import java.io.InputStreamReader;


public class Test1 {
	public static void main(String[] args) throws Exception {
		f("D:/abc/f1","GBK");
		f("D:/abc/f2","UTF-8");

	}
	private static void f(String path, String charset) throws Exception {
		InputStreamReader in = new InputStreamReader(new FileInputStream(path),charset);
		System.out.println((char)in.read());
		System.out.println((char)in.read());
		in.close();
	}
}
