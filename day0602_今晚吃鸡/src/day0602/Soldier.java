package day0602;

import java.util.Random;

public class Soldier {
	int id;
	int blood = 50;
	Weapon weapon;
	public void go() {
		System.out.println(id+"��ʿ��ǰ��");
	}
	public void attack() {
		if (blood == 0) {
			System.out.println("��ʿ��������");
			return;
		}
		System.out.println(id+"��ʿ�����𹥻�");
		if (this.weapon != null) {
			if (this.weapon.bullets == 0) {
				this.weapon.reload();
			}
			this.weapon.fire();
		}
		int d = new Random().nextInt(10);
		if (d > blood) {
			d = blood;
		}
		this.blood -= d;
		System.out.println(id+"��ʿ���ܵ�"+d+"���˺�");
		System.out.println("ʣ��Ѫ����"+blood);
		if (blood == 0) {
			System.out.println(id+"��ʿ������");
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	
}
