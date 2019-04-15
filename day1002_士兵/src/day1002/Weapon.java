package day1002;

import java.util.Random;

public class Weapon {
	private String name;
	private int bullets;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBullets() {
		return this.bullets;
	}
	
	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	public Weapon() {}
	public Weapon(String name) {
		this(name,50);
	}
	public Weapon(String name,int bullets) {
		this.name = name ;
		this.bullets = bullets;
	}
	public void fire() {
		System.out.println(this.name + "����");
		if (bullets == 0) {
			System.out.println("��ҩ�þ����������");
			return;
		}
		int r = 3 + new Random().nextInt(5);
		if (bullets < r) {
			 r = this.bullets;
		}
		bullets -=r; 
		for (int i = 1; i < r; i++) {
			System.out.print("biu");
		}
		System.out.println("~");
		System.out.println("ʣ�൯ҩ" + bullets);
	}
	public void reload() {
		bullets = 50;
	}

}
