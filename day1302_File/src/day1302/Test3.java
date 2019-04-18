package day1302;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("文件夹：");
		String s1 = new Scanner(System.in).nextLine();
		File dir = new File(s1);
		if (! dir.isDirectory()) {
			System.out.println("请输入正确的文件夹路径");
			return;
		}//如果对不存在的路径列表或无法访问的路径列表都返回null。
		String[] names = dir.list();
		File[] files = dir.listFiles();
		if (names == null) {
			System.out.println("无法获得目录列表");
			return;
		}
		for (int i = 0; i < files.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("\n--------------------------------");
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			System.out.println(f.getName()+"-"+f.length());
		}
	}
}
