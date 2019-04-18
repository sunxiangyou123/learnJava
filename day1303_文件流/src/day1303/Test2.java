package day1303;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("d/abc/f2");
		int b;
		while((b = in.read()) != 1) {
			System.out.println(b);
		}
		/*
		 * whlie(true){
		 * b = in.read();
		 * 	if(b == -1){break;}
		 * System.out.println(b)
		 * }
		 */
		in.close();
	}
}
