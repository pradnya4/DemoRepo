package oopsConcepts;

public class FunctionsInJava {

	//main method --starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj=new FunctionsInJava();
		//object will be created,obj is the refrence varaible
		//aftr creating the obj ,the copy of all non static method will be given to this object
		
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
		int d=obj.division(30,10);
		System.out.println(d);
		//main method is void ---never returns a value

	}
	
	//non ststic methods
//return type=void
	//void --does not return any value
	
	public void test() {//no input,no output
		System.out.println("Test method");
		
	} 
	
	//return type =int
	public int pqr() {//no inmput ,some output
		System.out.println("PQR methvoid");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
			} 
	
	//return type--string
	public  String qa() {//no inmput ,some output
		System.out.println("qa method");
		String s="Selenium";
		
		return s;
	}
	
	//return type=int
	//x,y --input parameters or arguments
	public int division(int x,int y) {//
		System.out.println("division method");
	int d=x/y;
	return d;
	
	}
}
