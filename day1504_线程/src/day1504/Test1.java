package day1504;

public class Test1 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		t1.start();
		t2.start();
	}
	static class T1 extends Thread{
		public void run() {
			String n = getName();
			for (int i = 0; i < 1000; i++) {
				System.out.println(n+"-"+i);
			}
		}
	}
}
