package day1505;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件名");
			return;
		}
		List<File> list = f(dir);
		long n = 0;
		for (File file : list) {
			n += file.length();
		}
		System.out.println(n);
	}

	private static List<File> f(File dir) {
		ArrayList<File> file = new ArrayList<>();
		LinkedList<File> stack = new LinkedList<>();
		stack.push(dir);
		while(!stack.isEmpty()) {
			File f = stack.pop();
			if (f.isFile()) {
				file.add(f);
			}
			else {
				File[] list = dir.listFiles();
				if (list == null) {
					continue;
				}
				for (File file2 : list) {
					stack.push(file2);
				}
			}
		}
		return file;
	}
}
