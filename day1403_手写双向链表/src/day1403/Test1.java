package day1403;

public class Test1 {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		list.add("fff");
		list.add("ggg");
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(0));
		System.out.println("--------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
