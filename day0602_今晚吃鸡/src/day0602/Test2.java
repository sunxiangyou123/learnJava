package day0602;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("欢迎进入刺激战场");
		Soldier[] s = new Soldier[100];
		for (int i = 0; i < s.length; i++) {
			Soldier s1 = new Soldier();
			s1.id = i+1;
			s1.weapon = new Weapon("M4A"+(i+1));
			s[i] = s1;
		}
		System.out.println("按回车执行");
		while(true) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < s.length; i++) {
				if (s[i].blood != 0) {
					s[i].attack();
					System.out.println("------");
				}
			}
			System.out.println("\n-------------------");
		}
	}

}
