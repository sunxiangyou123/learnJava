package day0901;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入回车执行");
		Shape s = null;
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: System.out.println("Shape 抽象类不能创建实例");
			case 1: s = new Line();
			break;
			case 2 : s = new Square();
			break;
			case 3: s = new Circle();
			break;
			}
			f(s);
		}
	}

	private static void f(Shape s) {
		System.out.println("--当做Shape父类型处理---------");
		String n = s.getClass().getName();
		System.out.println("真实类型："+n);
		s.draw();
		if (s instanceof Line) {
			System.out.println("向下转回成Line类型，在调用长度方法");
			Line line = (Line) s;
			line.length();
		}
		new Scanner(System.in).nextLine();
		s.clear();
	}
}
