package day0601;

import java.util.Random;

public class Soldier {
	int id;
	Weapon weapon;
	int blood = 100;
	
	public Soldier(int id) {
		this.id = id;
	}
	public void go() {
		int d = new Random().nextInt(100);
		System.out.println(id + "号士兵前进了"+d+"米");
	}
	public void attack() {
		if (this.blood == 0) {
			System.out.println(this.id+"号士兵已阵亡");
			return;
		}
		System.out.println(id + "士兵准备开火");
		int w =1 + new Random().nextInt(1);
		if (w == 1) {
		 this.weapon.name = "M4A1";
		}
		else {
		  weapon.name = "AK47";
		}
		weapon.fire();
	}
}
