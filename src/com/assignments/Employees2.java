package com.assignments;

public class Employees2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// without creating Obj , when we retrieve and store . it's going to use more memory space
		
		System.out.println("Empname:" + new Employees1().empNames[0]+","+"EmpIDs:" + new Employees1().empIDs[0]);
		System.out.println("Empname:" + new Employees1().empNames[1]+","+"EmpIDs:" + new Employees1().empIDs[1]);
		System.out.println("Empname:" + new Employees1().empNames[2]+","+"EmpIDs:" + new Employees1().empIDs[2]);
		
		
		// Here I used one of the methods for retrieve and store data from Employees1 to Employees2 by using Obj to reduce the memory space.
         Employees1 Obj =new Employees1();
        

         System.out.println("Empname:" +Obj.empNames[0]+ ", " + "EmpIDs:" +Obj.empIDs[0] );
         System.out.println("Empname:" +Obj.empNames[1]+ ", " + "EmpIDs:" +Obj.empIDs[1] );
         System.out.println("Empname:" +Obj.empNames[2]+ ", " + "EmpIDs:" +Obj.empIDs[2] );
  		
		
		
		
		
		
	}

}
