package day0701;

public class Employee extends Person{
	int salary;
	public Employee() {
	}
	@Override
	public String toString() {
		
		return super.toString()+","+salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
