package com.assignments;

public class Employees3 extends Employees1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Now, I am using "inheritance" to access and store data without creating Obj.
		Employees3 Obj = new Employees3();
		System.out.println("Empname:" + Obj.empNames[0]+ ","+"EmpIDs:" + Obj.empIDs[0]);
		System.out.println("Empname:" + Obj.empNames[1]+ ","+"EmpIDs:" + Obj.empIDs[1]);
		System.out.println("Empname:" + Obj.empNames[2]+ ","+"EmpIDs:" + Obj.empIDs[2]);

	}

}
