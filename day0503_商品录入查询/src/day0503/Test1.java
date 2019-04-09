package day0503;

import java.util.Scanner;

public class Test1 {
	static Item[] items = {
			new Item(1,"iphoneXsMax",9800,100),
			new Item(2,"huaWeiP30 pro",7300,50),
			new Item(3,"mi 9",3299,10),
			new Item(4,"meiZu 17",4000,20),
	};
	public static void main(String[] args) {
		outer:
			while(true) {
				int c = caidan();
				switch(c) {
				case 1 : f1();
				break;
				case 2 : f2();
				break;
				case 3 : f3();
				break;
				case 4 : f4();
				break;
				case 5 : 
				break outer;
				}
			}
	}
	private static int caidan() {
		System.out.println("\n-----------------------");
		System.out.println("1.商品列表");
		System.out.println("2.商品查询");
		System.out.println("3.商品录入");
		System.out.println("4.统计信息");
		System.out.println("5.退出");
		System.out.println("--------------------------");
		System.out.print("选择——>");
		int c = new Scanner(System.in).nextInt();
		return c;
	}
	private static void f1() {
		System.out.println("商品菜单：");
		for(int i = 0 ; i < items.length; i++) {
			System.out.println(items[i].toString());
		}
		
	}
	private static void f2() {
		//s.indexOf(子串)，在s中寻找子串的起始位置
		//存在则返回下标值，不存在则返回特殊值-1
		String n = new Scanner(System.in).nextLine();
		String m = n.toUpperCase();//将小写化成大写
		for (int i = 0; i < items.length; i++) {
			if(items[i].name.indexOf(n) >= 0 || items[i].name.indexOf(m) != -1) {
				System.out.println(items[i]);
			}
		}
		
	}
	private static void f3() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("录入第"+(i+1)+"件商品");
			System.out.print("编号");
			items[i].id = new Scanner(System.in).nextInt(); 
			System.out.print("名称");
			items[i].name = new Scanner(System.in).nextLine();
			System.out.print("价格");
			items[i].price = new Scanner(System.in).nextInt();
			System.out.print("数量");
			items[i].number = new Scanner(System.in).nextInt();
		}
		f1();
	}
	private static void f4() {
		double spzj = 0;
		double djzj = 0;
		double zgzj = 0;
		double zgdj = 0;
		for(int i = 0 ; i < items.length; i++) {
			Item s = items[i];
			double p = s.price;
			spzj += p *s.number;
			djzj += p;
			if(p*s.number >= zgzj) {
				zgzj = p*s.number;
			}
			if (p >= zgdj) {
				zgdj = p;
				
			}
			
		}
		System.out.println("商品总价："+spzj);
		System.out.println("单价均价："+(djzj/items.length));
		System.out.println("最高总价："+zgzj);
		System.out.println("最高单价总价："+zgzj);
	}

}
