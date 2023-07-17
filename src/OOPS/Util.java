package OOPS;

public class Util {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.a = 10;
		Child c = new Child();
		c.a = 10;
		c.b = 20;
		
		Parent obj = new Child();
		obj.a = 10;
//		obj.b = 20;
		obj.printA();
//		obj.printB();
		
//		Child obj2 = new Parent();
//		c.printA() ;
		final int num;
		num = 20;
		
		Parent.a = 30;
		
		
	}

}
