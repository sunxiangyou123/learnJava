package day1402;

public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		System.out.println(w1);
		System.out.println("\n-----------------------");
		Weapon w2 = f2("青龙偃月刀");
	}
	private static Weapon f1() {
		class AK47 implements Weapon{
			public void kill() {
				System.out.println("AK47进攻哒哒哒哒哒哒~");
			}
		}
		AK47 a = new AK47();
		return a;
	}
	private static Weapon f2(String name) {
		Weapon w = new Weapon() {
			public void kill() {
				System.out.println(name + "砍");
			}
		};
		return w;
	}
}
