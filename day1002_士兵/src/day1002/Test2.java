package day1002;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("士兵数量：");
		int n = new Scanner(System.in).nextInt();
		Soldier[] s = new Soldier[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Soldier();
			s[i].setId(i+1);
			s[i].setBlood(100);
			s[i].newWeapon();
		}
		System.out.println("回车执行");
		while(Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			for (int i = 0; i < s.length; i++) {
				if (s[i].getBlood() != 0) {
					s[i].attack();
				}
			}
			System.out.println("存货士兵数量："+Soldier.count);
		}
	}
}
