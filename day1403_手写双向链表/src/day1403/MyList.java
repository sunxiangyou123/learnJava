package day1403;

public class MyList {
	private Node first;
	private Node last;
	private int size;
	public void add(Object value) {
		Node n = new Node();
		n.value = value;
		if (size == 0) {
			n.prve = n;
			n.next = n;
			first = n;
			last = n;
		}else {
			n.prve = last;
			last.next = n;
			n.next = first;
			first.prve = n;
			last = n ;
		}
		size++;
	}
	public Object get(int i) {
		if (i < 0 || i > size) {
			throw new IndexOutOfBoundsException();
		}
		Node n = getNode(i-1);
		return n.value;
	}
	private Node getNode(int i) {
		if (i == 0 ) {
			return first;
		}
		if (i == size -1) {
			return last;
		}
		if (i < size/2) {
			Node n = first;
			for (int j = 1; j <= i; j++) {
				n = n.next;
			}
			return n;
		}
		else {
			Node n = last;
			for (int j = size - 2; j >= i; j--) {
				n = n.prve;
			}
			return n;
		}
	}
	public int size() {
		return size;
	}
	private class Node{
		Node prve;
		Node next;
		Object value;
	}
}
