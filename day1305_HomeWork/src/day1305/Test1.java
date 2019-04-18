package day1305;

import java.io.File;
import java.util.Scanner;import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class Test1 {
	public static void main(String[] args) {
			System.out.println("请输入文件夹");
			String s = new Scanner(System.in).nextLine();
			File f = new File(s);
			if (! f.isDirectory()) {
				System.out.println("请输入正确的文件夹");
				return;
			}
			String tuPian = xunZhao(f);
	}

	private static String xunZhao(File f2) {
		File[] list = f2.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isDirectory()) {
				xunZhao(f);
			}else {
				String s1 = f.getName();
				StringBuilder s =new StringBuilder();
				s.append(s1.substring(s1.lastIndexOf(".") + 1));
				
			}
		}
		return null;
	}
}
