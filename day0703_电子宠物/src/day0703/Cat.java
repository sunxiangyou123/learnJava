package day0703;

public class Cat extends Pet{
	String sound;
	public Cat(String name) {
		super(name);
	}
	public Cat(String name,int full, int happy) {
		super(name, full , happy);
	}
	public String cry() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
