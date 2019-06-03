package oopsConcepts;

public class Car {
	//class var;
	int mod;
	int wheel;
	
	public static void main(String[] args) {
	//mew Car() -- this is object of class
		//new keyword is used to create object
		//a,b,c --- object refrence varaible.
		
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		a.mod=2016;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=3;
		
		c.mod=2015;
		c.wheel=4;
		
		System.out.println("before assigning references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after shifting references");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod); //10
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);



		
	}

}
