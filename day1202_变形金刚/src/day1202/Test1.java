package day1202;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Transformer t = new Transformer();
		Sword s = new Sword();
		AK47 a = new AK47();
		Lyb l = new Lyb();
		System.out.println("回车执行，q退出");
		while(true) {
			String s1 = new Scanner(System.in).nextLine();
			if (s1.equals("q")) {
				break;
			}
			int r = new Random().nextInt(4);
			switch(r) {
			case 0: t.setWeapon(s);break;
			case 1: t.setWeapon(a);break;
			case 2: t.setWeapon(l);break;
			case 3: t.setWeapon(null);break;
			}
			t.attack();
		}
	}
}
