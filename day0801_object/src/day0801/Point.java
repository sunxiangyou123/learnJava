package day0801;

public class Point {
	int x;
	int y;
	//�޲ι��졢ȫ�ι���
	public Point() {
	}

	public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
	@Override
	public String toString() {
	    return "Point [x=" + x + ", y=" + y + "]";
	}
	/*
	 * a = {x:3, y:4}
	 * b = {x:3, y:4}
	 * a.equals(b)
	 */
	@Override
	public boolean equals(Object obj) {
	    Point p = (Point) obj;
	    //��ǰ�����x,y���Ͳ�������p��x,y�Ƚ�
	    return this.x == p.x && this.y == p.y;
	}
}
