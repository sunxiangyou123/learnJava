package day0901;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����س�ִ��");
		Shape s = null;
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: System.out.println("Shape �����಻�ܴ���ʵ��");
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
		System.out.println("--����Shape�����ʹ���---------");
		String n = s.getClass().getName();
		System.out.println("��ʵ���ͣ�"+n);
		s.draw();
		if (s instanceof Line) {
			System.out.println("����ת�س�Line���ͣ��ڵ��ó��ȷ���");
			Line line = (Line) s;
			line.length();
		}
		new Scanner(System.in).nextLine();
		s.clear();
	}
}
