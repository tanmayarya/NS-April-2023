package Introduction;

public abstract class AbstractTutorial {
	
	static int a;
	public static void func() {
		
	}
	
	abstract void print();

}

 class C extends AbstractTutorial{ //The type C must implement the inherited abstract method AbstractTutorial.print()
	
	 @Override
	void print() {
		System.out.println("Overriding method");
		
		Shape s = new Square();
		s.area();
	}
}
 
 abstract class Shape {
	 
	 abstract double area();
 }
 
 class Square extends Shape {
	 int side;
	 @Override
	 double area() {
		 return this.side * this.side;
	 }
 }
 
 class Triangle extends Shape {
	 int height;
	 int base;
	 @Override
	 double area() {
		 return this.height * this.base * 0.5;
	 }
 }
