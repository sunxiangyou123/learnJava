package day1202;

public class Transformer {
	private Weapon w;
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	public void attack() {
		System.out.println("变形金刚进攻");
		if (w == null) {
			System.out.println("用牙咬");
			return;
		}
		String r ="";
		switch(w.getType()) {
		case Weapon.TYPE_COLD: r = "冷兵器";break;
		case Weapon.TYPE_HOT: r = "冷兵器";break;
		case Weapon.TYPE_NUCLEAR: r = "冷兵器";break;
		}
		System.out.println("使用"+r+w.getName()+"进攻");
		w.kill();
	}
}
