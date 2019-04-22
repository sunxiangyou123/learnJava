package day1501;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入文件");
		String a = new Scanner(System.in).nextLine();
		File f = new File(a);
		if (!f.isDirectory()) {
			System.out.println("请输入正确的文件夹");
			return;
		}else {
			List<File> list = f(f);
			for (File f1 : list) {
				System.out.println(f1.getAbsolutePath());
			}
		}
	}

	private static List<File> f(File dir) {
		 ArrayList<File> list = new ArrayList<>();
		 LinkedList<File> ll = new LinkedList<>();
		 ll.push(dir);
		 while(! ll.isEmpty()) {
			 File f = ll.pop();
			 if (f.isFile()) {
				list.add(f);
			}
			 else {
				 FileFilter filter = new FileFilter() {
					@Override
					public boolean accept(File f) {
						if (f.isDirectory()) {
							return true;
						}
						String s = f.getName().toLowerCase();
						return s.matches(".+\\.(png|jpg|gif|bmp)");
					}
				};
				File[] f3 = f.listFiles(filter);
				for (File file : f3) {
					ll.push(file);
				}
			 }
		 }
		return list;
	}
}
