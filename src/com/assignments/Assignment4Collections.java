package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4Collections {

	public static void main(String[] args) {
	// As per the given data, I choose Map with child class of HashMap because the data which are used as key and values to store multiple data at the same memory location.
		
    // Actually I have a question why don't we use map with child class of "LinkedHashMap".
		
	// 	1st employees details are added in row1 
		
       Map<String,String> row1 = new HashMap<String,String>();
    	   
       
       row1.put ("Employee ID","E001");
       row1.put ("Name", "Alice Green");
       row1.put ("Age", "30");
       row1.put ("Gender", "Femeal");
       row1.put ("Department","Engineering");
       row1.put("Position", "Software Engineer");
       row1.put("Salary", "75,000");
       row1.put("Email", "alice@example.com");
       row1.put("Contact Number","9876543213");
       System.out.println("1st employee details :" + row1);
    	   
    //	2st employees details are added in row2	   
       
    	   Map<String,String> row2 = new HashMap<String,String>();
           row2.put ("Employee ID","E002");
           row2.put ("Name", "Bob Johnson");
           row2.put ("Age", "35");
           row2.put ("Gender", "Meal");
           row2.put ("Department","Marketing");
           row2.put("Position", "Marketing Manager");
           row2.put("Salary", "85,000");
           row2.put("Email","bob@example.com");
           row2.put("Contact Number","9876543214");
           System.out.println("2nd employee details :" + row2);
           
    // 	3st employees details are added in row3
           
           
        	   Map<String,String> row3 = new HashMap<String,String>();
               row3.put ("Employee ID","E003");
               row3.put ("Name", "Carol White");
               row3.put ("Age", "28");
               row3.put ("Gender", "Femeal");
               row3.put ("Department","Sales");
               row3.put("Position", "Sales Excutive");
               row3.put("Salary", "65,000");
               row3.put("Email", "carol@example.com");
               row3.put("Contact Number","9876543215"); 
               System.out.println("3rd employee details :" + row3);
               
     // All three employee details are linked to "List".         
               
               
            	   List<Map<String,String>> empData = new ArrayList<Map<String,String>>();
            	   empData.add(row1);
            	   empData.add(row2);
            	   empData.add(row3);
            	   System.out.println(empData.get(1).get("Email"));
            	   System.out.println(empData);
            	   System.out.println("ArrayListMap Size is :" + empData.size());
            	   
               }
           
    	
       }
	


