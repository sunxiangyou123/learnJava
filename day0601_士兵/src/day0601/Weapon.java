package day0601;

import java.util.Random;

public class Weapon {
	String name;
	int bullets;
	public Weapon() {}
	public Weapon(String name) {
		this(name,50);
	}
	public Weapon(String name,int bullets) {
		this.name = name ;
		this.bullets = bullets;
	}
	public void fire() {
		System.out.println(this.name + "¿ª»ð");
		if (bullets == 0) {
			System.out.println("µ¯Ò©ÓÃ¾¡Çë¸ü»»µ¯¼Ð");
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
		System.out.println("Ê£Óàµ¯Ò©" + bullets);
	}
	public void reload() {
		bullets = 50;
	}

}
