package day1302;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("回车执行");
		new Scanner(System.in).nextLine();
		File dir = new File("D:/abc/ab");
		dir.mkdirs();
		new Scanner(System.in).nextLine();
		File f = new File("D:/abc/ab/f1");//建议用第两种构造方法：dir,"f1"
		f.createNewFile();
		new Scanner(System.in).nextLine();
		f.delete();
		new Scanner(System.in).nextLine();
		dir.delete();
	}
}
