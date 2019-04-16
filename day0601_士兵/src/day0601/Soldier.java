package day0601;

import java.util.Random;

public class Soldier {
	private int id;
	private Weapon weapon;
	private int blood;
	
	public Soldier(int id) {
		this.id = id;
		this.blood = 100;
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
		newWeapon();
		weapon.fire();
	}
	
	/**
	 * 给士兵实体赋值一个随机武器
	 */
	private void newWeapon() {
		int w =1 + new Random().nextInt(1);
		this.weapon = new Weapon();
		if (w == 1) {
		 this.weapon.setName("M4A1");
		}
		else {
		  weapon.setName("AK47");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}
	
}
