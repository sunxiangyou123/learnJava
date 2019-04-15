package day1002;

import java.util.Random;

public class Soldier {
	private int id;
	private Weapon weapon;
	private int blood;
	static int count;
	public Soldier() {
		count++;
	}
	
	public Soldier(int id) {
		this.id = id;
		this.blood = 100;
		count++;
	}
	
	public void go() {
		int d = new Random().nextInt(100);
		System.out.println(id + "��ʿ��ǰ����"+d+"��");
	}
	
	public void attack() {
		System.out.println(id + "ʿ��׼������");
		weapon.fire();
		int d = new Random().nextInt(20);
		if (this.blood < d) {
			d = this.blood;
		}
		this.setBlood(this.getBlood() - d); 
		System.out.println(id+"��ʿ���ܵ�"+d+"���˺�");
		if (this.blood == 0) {
			System.out.println(this.id+"��ʿ��������");
			count--;
			return;
		}
		
	}
	
	/**
	 * ��ʿ��ʵ�帳ֵһ���������
	 */
	public void newWeapon() {
		int w =1 + new Random().nextInt(2);
		this.weapon = new Weapon();
		if (w == 1) {
		 this.weapon.setName("M4A1");
		 weapon.setBullets(50);
		}
		else {
		  weapon.setName("AK47");
		  weapon.setBullets(50);
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
