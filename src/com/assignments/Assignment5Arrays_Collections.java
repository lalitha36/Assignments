package com.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5Arrays_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a list of the top 5 most populated countries in the world by using ArrayList 
		//because it's stored the values in contagious memory( storing all the values at one place side by side).
		// In addition, whenever we required to access the data by using Index.
		
		// 1.creating a list of 5 populated countries in the wolrd and print 2nd country.
		
		List <String> Populated5CountriesArrayList = new ArrayList <String>();
		Populated5CountriesArrayList.add("India");
		Populated5CountriesArrayList.add("China");
		Populated5CountriesArrayList.add("UnitedStates");
		Populated5CountriesArrayList.add("Indonesia");
		Populated5CountriesArrayList.add("Pakistan");
		System.out.println("2nd Populate Country is :" + Populated5CountriesArrayList.get(1));
		
		
		// 2. Creating a set of the top 10 most visited tourist attractions in the world and print out its size.
		
		// Here, we can use HashSet or LinkedHashSet or TreeSet  
		// As 1.Here are no duplicate values so we can use HashSet,Linked HashSet and TreeSet.
		// 2. here are no null values 
		// 3. And also here is no mention to print particular order like Alphabetical or random or insertion.
		
		Set <String> TouristAttractionsHashSetSet = new HashSet <String>();
		TouristAttractionsHashSetSet.add("Eiffel Tower");
		TouristAttractionsHashSetSet.add("Colosseum");
		TouristAttractionsHashSetSet.add("Great Wall Of China");
		TouristAttractionsHashSetSet.add("Louvre Museum");
		TouristAttractionsHashSetSet.add("Basilica de la Sagrada Familia");
		TouristAttractionsHashSetSet.add("Angkor Wat");
		TouristAttractionsHashSetSet.add("Acropolis Of Athens");
		TouristAttractionsHashSetSet.add("Burj Khalifa");
		TouristAttractionsHashSetSet.add("Niagara Falls");
		TouristAttractionsHashSetSet.add("Taj Mahal");
		System.out.println("Size of the Set :" + TouristAttractionsHashSetSet.size());
		
		// Create a Map of the 5 largest cities in the USA and their populations.
		 // Here , we can use LinkedHashMap because we need to access keys and values in insertion order.
		
		
		Map<String,String> LcitiesAndPopulationsLinkedHashMap = new LinkedHashMap<String,String>();
				 LcitiesAndPopulationsLinkedHashMap.put("New York", "8,335,897");
				 LcitiesAndPopulationsLinkedHashMap.put("Los Angeles", "3,822,238");
				 LcitiesAndPopulationsLinkedHashMap.put("Chicago", "2,665,039");
				 LcitiesAndPopulationsLinkedHashMap.put("Houston", "2,302,878");
				 LcitiesAndPopulationsLinkedHashMap.put("Phoenix", "1,644,409");
				 System.out.println("5 Largest cities & their population in the USA :" + LcitiesAndPopulationsLinkedHashMap);
				 
				 
		 // Create an Array of 10 random integers and print out the sum of '3rd' and '5th' value.
		 
		// Here, First, I use Array only to sum of two values by accessing the values with (index) .
				 
			int [] Random10Integers = new int[10];
			Random10Integers[0] = 3;
			Random10Integers[1] = 2;
			Random10Integers[2] = 6;
			Random10Integers[3] = 4;
			Random10Integers[4] = 5;
			Random10Integers[5] = 1;
			Random10Integers[6] = 7;
			Random10Integers[8] = 8;
			Random10Integers[9] = 9;
			System.out.println("Sum of 3rd and 5th values are :" + (Random10Integers[2]+Random10Integers[4]));
			
			// Second, I used ArrayList to add two values by accessing values with (get.(index)).
			
			List <Integer> Random10IntegersArrayList = new ArrayList <Integer>();
			Random10IntegersArrayList.add(3);
			Random10IntegersArrayList.add(2);
			Random10IntegersArrayList.add(6);
			Random10IntegersArrayList.add(4);
			Random10IntegersArrayList.add(5);
			Random10IntegersArrayList.add(1);		
			Random10IntegersArrayList.add(7);
			Random10IntegersArrayList.add(8);
			Random10IntegersArrayList.add(9);
			System.out.println("Sum of 3rd and 5th values are :" + (Random10IntegersArrayList.get(2) + Random10IntegersArrayList.get (4)));
				 
	
		 //
		
		  List <String> HGrossingMoviesArrayList = new ArrayList<String>();
		  HGrossingMoviesArrayList.add("Avatar");
		  HGrossingMoviesArrayList.add("Avengers:Endgame");
		  HGrossingMoviesArrayList.add("Avatar:The Way Of Water");
		  HGrossingMoviesArrayList.add("Titanic");
		  HGrossingMoviesArrayList.add("Star Wars:Awakens");
		  System.out.println("The 3rd moive of the list is: " + HGrossingMoviesArrayList.get(2));
		

	}

}
