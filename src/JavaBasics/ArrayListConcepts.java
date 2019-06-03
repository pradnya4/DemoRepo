package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[3]; //static array ..size is fixed
		
		//dynamic array --- arrayList
		//can conmtain duplicate values/elements
		//2.maintains insertion order
		//3.not synchronized
		//4.allows random access to fetch any element because it stores
		//it stores values o the bsics of indexes
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(30);
		ar.add(50);
		
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(20);
		ar.add(20.30);
		ar.add('a');
		ar.add("TEST");
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//to print all values from arraylist
		//1,for loop
		//2.iterator
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 =new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Selenium");
		
		ArrayList<String> ar2 =new ArrayList<String>();
		ar2.add("TEST");
		
		ArrayList<E> ar3 =new ArrayList<E>();

		//Employee class object
		Employee e1=new Employee("Pradu",12,"IT");	
		Employee e2=new Employee("sne",32,"DEV");		
		Employee e3=new Employee("Mona",22,"QA");
		
		//create arraylist
		ArrayList <Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}
		
		System.out.println("***************");
		//addAll()
		ArrayList<String> ar5 =new ArrayList<String>();
		ar5.add("TEST");
		ar5.add("selenium");
		ar5.add("OTP");
		
		
		//addAll()
		ArrayList<String> ar6 =new ArrayList<String>();
		ar6.add("dev");
		ar6.add("automation");
		ar6.add("java");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) 
		{
			System.out.println(ar5.get(i));
		}
	
		System.out.println("***************");

	//removeAll
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) 
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***************");
		//retain all()
		ArrayList<String> ar7 =new ArrayList<String>();
		ar7.add("TEST");
		ar7.add("selenium");
		ar7.add("java");
		
		
		ArrayList<String> ar8 =new ArrayList<String>();
		ar8.add("dev");
		ar8.add("automation");
		ar8.add("java");
	
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++)
			{
			System.out.println(ar7.get(i));
			}
	
	}
	
	

}
//explanation of iterator
//how to store the specific user defined class object into  array
  // create one constructor using 3 variables and store the variables like e1,e2,e3

//with help of iterator we need to print it ie traverse through.






