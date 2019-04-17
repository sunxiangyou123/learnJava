package day1201;

import java.io.File;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		f();
	}

	private static void f() {
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		s = s.replaceAll(":","." );
		String path = "d:\\"+s+".txt";
		File f = new File(path);
		try {
			f.createNewFile();
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
}
