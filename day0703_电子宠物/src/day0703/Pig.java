package day0703;

public class Pig extends Pet{
	String sound;
	public Pig(String name) {
		super(name);
	}
	public Pig(String name,int full, int happy) {
		super(name, full , happy);
	}
	public String cry() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
