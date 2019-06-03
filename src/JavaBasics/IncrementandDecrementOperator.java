package JavaBasics;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
	//++
		//--
		
		int i=1;
		int j=i++;//post incr -- value of i will be given to j first i.e value of j will be 1 and 
		//and then increment the value of i+1 i.we i =2
	
	System.out.println(i);
	System.out.println(j);
	System.out.println("*****************");
	int a=1;
	int b=++a;//pre increment --increase value of a by one first i.e a=2 and the giv the value to b
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("*****************");
	int m=2; 
	int n=m--;//post dec -- value of m will be given to n first i.e value of n will be 1 and 
	//and then DEC the value of M-- i.we M=2	
	System.out.println(m);
	System.out.println(n);
	

	System.out.println("*****************");
	int p=2;
	int q=--p;//pre dec decrease value of p by 1 then q=1 and p is alredy decread so p=1.
	System.out.println(p);
	System.out.println(q);
	}
}
