package day0602;

import java.util.Random;

public class Weapon {
	String name;
	int bullets;
	public Weapon(String name) {
		this(name, 50);
	}
	public Weapon(String name,int bullets) {
		this.name = name;
		this.bullets = bullets;
	}
	public void fire() {
		System.out.println(name + "开火");
		int r = 3 + new Random().nextInt(5);
		if (r > bullets) {
			r = bullets;
		}
		for (int i = 1; i <= r; i++) {
			System.out.print("biu");
		}
		bullets -= r;
		System.out.println("~");
		System.out.println("剩余子弹数量:"+bullets);
	}
	public void reload() {
		bullets = 100;
	}

}
