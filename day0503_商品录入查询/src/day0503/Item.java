package day0503;

public class Item {
	double price;
	int id;
	String name;
	int number;
	public Item() {}
	public Item(int id,String name,double price,int number) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	public String toString() {
		return "��ţ�"+id+"������"+name+",�۸񣺣�"+price+",����"+number;
	}
}
