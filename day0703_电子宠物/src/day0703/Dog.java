package day0703;

public class Dog extends Pet{
	String sound;
	public Dog(String name) {
		super(name);
	}
	public Dog(String name,int full, int happy) {
		super(name, full , happy);
	}
	public String cry() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
