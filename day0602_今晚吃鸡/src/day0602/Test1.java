package day0602;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Weapon w1 = new Weapon("M4A1");
		Weapon w2 = new Weapon("AK47",35);
		System.out.println("回车发射，输入R装载子弹");
		while(true) {
			String s = new Scanner(System.in).nextLine();
			if (s.equals("r")) {
				w1.reload();
				w2.reload();
				System.out.println("弹夹已装满");
				continue;
			}
			w1.fire();
			w2.fire();
		}

	}

}
