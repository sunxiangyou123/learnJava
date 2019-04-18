package day1302;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("文件夹：");
		String s1 = new Scanner(System.in).nextLine();
		File dir = new File(s1);
		if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹路径");
			return;
		}
		long size = dirLength(dir);
		System.out.println(size);
		
	}

	private static long dirLength(File dir) {
		File[] list = dir.listFiles();
		if (list == null) {
			return 0;
		}
		long sum = 0;
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isFile()) {
				sum += f.length();
			}
			else {
				sum += dirLength(f);
			}
		}
		return sum;
	}
}
