package JavaBasics;

public class SwapTwoNumWithoutThird {
	public static void main(String[] args) {
	
	int a=20;
	int b=30;
	System.out.println("Before swapping number: a="+a +" b=" +b);

	a=a+b;//value of ais now 50;
	b=a-b;//value of b=50-30 i.e 20;
	a=a-b;//value of a=50-20 i.e 30 
	System.out.println("After swapping number: a="+a +" b=" +b);
	
	}

}
