package OOPS;

public class Child extends Parent {
	int b;
	
	public void printB() {
		System.out.println(this.b);
		this.a = 20;
	}
	
	@Override
	public void printA() {
		System.out.println("Hi, I am child");
	}
}
