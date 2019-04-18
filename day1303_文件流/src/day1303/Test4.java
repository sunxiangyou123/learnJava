package day1303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if (! from.isFile()) {
			System.out.println("请输入正确的文件");
			return;
		}
		System.out.println("目标文件");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if (to.isDirectory()) {
			System.out.println("请具体到文件，不能是文件夹");
			return;
		}try {
			Copy(from,to);
			System.out.println("finish");
		} catch (Exception e) {
			System.out.println("falid");
		}
	}

	private static void Copy(File from, File to) throws Exception {
		FileInputStream in = new FileInputStream(from);	
		FileOutputStream out = new FileOutputStream(to);
		byte[] b = new byte[8192];
		int n;
		while((n = in.read(b)) != -1) {
			out.write(b, 0, n);
		}
		in.close();
		out.close();
		
	}
}
