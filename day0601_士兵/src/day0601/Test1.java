package day0601;

import java.util.Scanner;

public class Test1 {
	static Soldier s1 = new Soldier(9527);
	static Soldier s2 = new Soldier(9528);
	
	public static void main(String[] args) {
	System.out.println(s1.id+"��ʿ��,"+s2.id+"��ʿ�����������ָʾ��");
	 outer:
		 while(true) {
			 int c = caidan();
			 switch(c) {
			 case 1 : choice();
			 break;
			 case 2 : f2();
			 break;
			 case 3 :
			 break outer;
			 }
			 
		 }

}
	
	private static int caidan() {
		System.out.println("------------------------------");
		System.out.println("1.ʿ��ǰ��");
		System.out.println("2.ʿ������");
		System.out.println("3.����");
		System.out.println("ѡ�񡪡�>");
		int c = new Scanner(System.in).nextInt();
		System.out.println("\n-----------------------------");
		return c;
	}
	private static void choice() {
		System.out.println("������Ҫǰ����ʿ����ţ�");
		int c = new Scanner(System.in).nextInt();
		if(c == 9527) {
			s1.go();
		}
		else if (c == 9528) {
			s2.go();
		}
		else {
			System.out.println("δ�ҵ���ʿ����");
		}
		
	}
	private static void f2() {
		System.out.println("������Ҫ������ʿ����ţ�");
		int c = new Scanner(System.in).nextInt();
		if(c == 9527) {
			s1.attack();
		}
		else if (c == 9528) {
			s2.attack();
		}
		else {
			System.out.println("δ�ҵ���ʿ����");
		}
		
	}
}
