package day0701;

public class Person {
	String name;
	String gender;
	int age;
	public Person() {
		this("无名","不明",18);
	}
	public Person(String name,String gender,int age) {
		this.name = name ;
		this.gender = gender;
		this.age = age;
	}
	public String toString() {
		return name +","+ gender+"," + age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
