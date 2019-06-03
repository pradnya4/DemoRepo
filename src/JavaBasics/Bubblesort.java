package JavaBasics;

public class Bubblesort {

	void bubbleSort(int arr[])
	{
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[i]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
									
				}
				
			}
			
			
		}
	}
	
	public void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ " ");
			System.out.println();
		}	
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubblesort ob= new Bubblesort();
		int arr[]= {65,11,75,33,90,14,40};
		ob.bubbleSort(arr);
		System.out.println("sorted array");
		ob.printArray(arr);
		}

}
