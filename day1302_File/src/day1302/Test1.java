package day1302;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "D:\\1\\eclipse\\eclipse.exe";
		path = "D:/1/eclipse";
		path = "F:/xx/xxx/xx";
		File f = new File(path);
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
}
