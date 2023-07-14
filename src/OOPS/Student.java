package OOPS;

public class Student {
	
	String name;
	int rollNo;
	
	
	// constructor overloading
	public Student() {
		this.name = "random name";
		this.rollNo = 0;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

}
