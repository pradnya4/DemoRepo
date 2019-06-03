package JavaBasics;

public class TwoDimensnalArray {

	public static void main(String[] args) {

		String x[][]=new String[3][5];
		System.out.println(x.length);//totl num of rows
		System.out.println(x[0].length); //total num of columns
		
		//1st row
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		//2nd row
		x[1][0]="f";
		x[1][1]="g";
		x[1][2]="h";
		x[1][3]="i";
		x[1][4]="j";
		
		//3rd row
		x[2][0]="f";
		x[2][1]="g";
		x[2][2]="h";
		x[2][3]="i";
		x[2][4]="j";
		System.out.println(x[1][2]);
		//to print all the values
		for(int row=0;row<x.length;row++)
		{
			for(int col =0;col<x[0].length;col++) {
				
				System.out.println(x[row][col]);

			}
			System.out.println("");

		}
		
		
		
	}

}
