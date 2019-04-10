package day0702;

public class Test1 {
public static void main(String[] args) {
	Point p1 = new Point(5,4);
	Point3D p2 = new Point3D(5,4,3);
	System.out.println(p1.toString());
	System.out.println(p1.distance());
	System.out.println("------------------");
	System.out.println(p2);
	System.out.println(p2.distance());
	
}
}
