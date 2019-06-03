package JavaBasics;

public class ArrayClass {

	public static void main(String[] args) {

		//array to store similsr datatype in a array variable
		// int array
		//lowest bound/index=0;
		///uperbound =n-1(n is size of array)
		
		//disadvantage
		//1. size is fixed -- to overcome this probm, we use collections
		//similar dtatypes..to overcome this probm, we use Object array 
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		//System.out.println(i[4]); //arrayoutofboundexception
		
		System.out.println(i.length);//size of array
		
		//print all values of array for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}

		//2.double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		System.out.println(d[1]);
		
		//3.char array
				char c[]=new char[3];
				c[0]='a';
				c[1]='c';
				System.out.println(c[1]);
		
		//4.string array
				String s[]=new String[3];
				s[0]="pradu";
			s[1]="abcdef";
			System.out.println(s[1]);

			
//5.Object Array; Object is a class--used to store diff datatype values
			Object ob[]=new Object[6];
			ob[0]="TOM";
			ob[1]=25;
			ob[2]=12.33;
			ob[3]="1/1/1990";
			ob[4]="abc";
			System.out.println(ob[3]);
			
			for(int p=0;p<=ob.length;p++) {
				System.out.println(ob[p]);
			}

	}

}
