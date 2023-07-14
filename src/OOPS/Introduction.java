package OOPS;

public class Introduction {
	
	public static void fun(Integer x) {
		x = 10;
	}

	public static void main(String[] args) {
		Integer x = 20;
		fun(x);
		System.out.println(x);
		
		A obj = new A();
//		A.B obj2 = new A.B();
		A.B obj2 = new A.B();
		A obj3 = new A();
		A obj4 = new A();
		
		
		Student s1 = new Student();
		Student s2 = new Student("Newton School");
		Student s3 = new Student(1);
		Student s4 = new Student("Tanmay", 10);
		
		System.out.println(s3.name);
		System.out.println(s3.rollNo);
		
		System.out.println(s4.name);
		System.out.println(s4.rollNo);

	}

}
