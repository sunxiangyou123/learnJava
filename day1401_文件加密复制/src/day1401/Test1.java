package day1401;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("原文件");
		String s1 = new Scanner(System.in).nextLine();
		File f1 = new File(s1);
		if (! f1.isFile()) {
			System.out.println("请输入正确的文件名");
			return;
		}
		System.out.println("目标文件");
		String s2 = new Scanner(System.in).nextLine();
		File f2 = new File(s2);
		if (f2.isDirectory()) {
			System.out.println("请输入正确的文件");
			return;
		}
		try {
			copy(f1,f2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void copy(File f1, File f2) throws Exception {
		 System.out.println("输入密码Key");
		 int key = new Scanner(System.in).nextInt();
		 FileInputStream in = new FileInputStream(f1);
		 FileOutputStream out = new FileOutputStream(f2);
		 byte[] b = new byte[8192];
		 int n;
		 while((n = in.read(b)) !=-1) {
			 for (int i = 0; i < n; i++) {
				  b[i] ^= key;
			}
			 out.write(b, 0, n);
			 
		 }
		 in.close();
		 out.close();
	}
}
