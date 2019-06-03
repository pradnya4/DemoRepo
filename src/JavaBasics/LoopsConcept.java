package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1.while loop
		//disadvntage --it will generate infinite loop if not given inc or decrement
		int i=1;	//declare a variable
		while(i<=10) { //condition
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		System.out.println("*********");
		
		//2.for loop
		//printing 1 to 10
		for(int j=1;j<=10;j++) {//initalization,condition,incremental/decremental
			System.out.println(j);
		}
		
		System.out.println("*********");
		//print 10 to 1
		for(int k=10;k>=1;k--)
		{
			System.out.println(k);
		}
		
		System.out.println("*********");
		//-1>-10 true
		//1>10 false
		
		for(int l=10;l>=-10;l--)
		{
			System.out.println(l);
		}
		
	}

}
