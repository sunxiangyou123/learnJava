package day0501;

public class Student {
	int id;
	String name;
	String gender;
	int age;
	public Student() {
			}
	public Student(int id,String name) {
		this(id,name,null);
		
	}
	public Student(int id ,String name ,String gender) {
		this(id,name,gender,0);
	}
	public Student(int id ,String name ,String gender,int age) {
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	}
	public String toString() {
		return id+","+name+","+gender+","+age;
	}
}
