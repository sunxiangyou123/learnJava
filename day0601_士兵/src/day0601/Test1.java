package day0601;

import java.util.Scanner;

public class Test1 {
	static Soldier s1 = new Soldier(9527);
	static Soldier s2 = new Soldier(9528);
	
	public static void main(String[] args) {
	System.out.println(s1.id+"号士兵,"+s2.id+"号士兵整顿完毕请指示：");
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
		System.out.println("1.士兵前进");
		System.out.println("2.士兵进攻");
		System.out.println("3.结束");
		System.out.println("选择——>");
		int c = new Scanner(System.in).nextInt();
		System.out.println("\n-----------------------------");
		return c;
	}
	private static void choice() {
		System.out.println("输入想要前进的士兵编号：");
		int c = new Scanner(System.in).nextInt();
		if(c == 9527) {
			s1.go();
		}
		else if (c == 9528) {
			s2.go();
		}
		else {
			System.out.println("未找到该士兵！");
		}
		
	}
	private static void f2() {
		System.out.println("输入想要进攻的士兵编号：");
		int c = new Scanner(System.in).nextInt();
		if(c == 9527) {
			s1.attack();
		}
		else if (c == 9528) {
			s2.attack();
		}
		else {
			System.out.println("未找到该士兵！");
		}
		
	}
}
