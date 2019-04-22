package day1504;

public class Test2 {
	public static void main(String[] args) {
		
	}
	static class R1 implements Runnable{

		@Override
		public void run() {
			Thread t = Thread.currentThread();
			String n = t.getName();
			for (int i = 0; i < 1000; i++) {
				System.out.println(n+"-+i");
			}
		}
		
	}
}
