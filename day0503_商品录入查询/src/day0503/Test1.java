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
		System.out.println("1.��Ʒ�б�");
		System.out.println("2.��Ʒ��ѯ");
		System.out.println("3.��Ʒ¼��");
		System.out.println("4.ͳ����Ϣ");
		System.out.println("5.�˳�");
		System.out.println("--------------------------");
		System.out.print("ѡ�񡪡�>");
		int c = new Scanner(System.in).nextInt();
		return c;
	}
	private static void f1() {
		System.out.println("��Ʒ�˵���");
		for(int i = 0 ; i < items.length; i++) {
			System.out.println(items[i].toString());
		}
		
	}
	private static void f2() {
		//s.indexOf(�Ӵ�)����s��Ѱ���Ӵ�����ʼλ��
		//�����򷵻��±�ֵ���������򷵻�����ֵ-1
		String n = new Scanner(System.in).nextLine();
		String m = n.toUpperCase();//��Сд���ɴ�д
		for (int i = 0; i < items.length; i++) {
			if(items[i].name.indexOf(n) >= 0 || items[i].name.indexOf(m) != -1) {
				System.out.println(items[i]);
			}
		}
		
	}
	private static void f3() {
		for (int i = 0; i < items.length; i++) {
			System.out.println("¼���"+(i+1)+"����Ʒ");
			System.out.print("���");
			items[i].id = new Scanner(System.in).nextInt(); 
			System.out.print("����");
			items[i].name = new Scanner(System.in).nextLine();
			System.out.print("�۸�");
			items[i].price = new Scanner(System.in).nextInt();
			System.out.print("����");
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
		System.out.println("��Ʒ�ܼۣ�"+spzj);
		System.out.println("���۾��ۣ�"+(djzj/items.length));
		System.out.println("����ܼۣ�"+zgzj);
		System.out.println("��ߵ����ܼۣ�"+zgzj);
	}

}
