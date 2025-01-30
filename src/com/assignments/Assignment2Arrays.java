package com.assignments;

public class Assignment2Arrays {
/*Creating a 3D array , it contains 5 semesters , 6 subjects along with the marks 
 * firstly, I take semester as main array
 * secondly, semester 1,2,3,4&5 are taken as sub array as 2D
 * thirdly, subjects and marks are taken as 3D array
 * then, enter values of subject and marks in single array with in same data type
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [][][] semesters = {
        		{
        			{"Mathematics1", "78"},
        			{"Physics", "85"},
        			{"Chemistry" , "91"},
        			{"Computer Programing" , "74"},
        			{"Engineering Drawing" , "88"},
        			{"Basic Elecrtical Eng" , "79"}
        		},
        		{
        			{"Mathematics2" , "82"},
        			{"Mechanics" , "77"},
        			{"Envinornmental Sci." , "93"},
        			{"Basic Electronics" , "69"},
        			{"Engineering Physics" , "84"},
        			{"Engineering Ghrapics" , "90"}
        		},
        		{
        			{"Data Structures" , "88"},
        			{"Discrete Mathametics" , "81"},
        			{"Digital Electronics" , "76"},
        			{"Operating System" , "92"},
        			{"Signals and Systaems" , "85"},
        			{"Object Oriented Prog." , "78"}
        		},
        		{
        			{"Algorithams" , "91"},
        			{"Computer Networks" , "73"},
        			{"Database Systems" , "89"},
        			{"Microprocessors" , "80"},
        			{"Communication English", "76"},
        			{"Softwear Engineering" , "87"}
        		},
        		{
        			{"Probability & Status" , "86"},
        			{"Machine Learining" , "88"},
        			{"Compiler Design" , "84"},
        			{"Theory of Computation" , "95"},
        			{"Embedded Systems" , "73"},
        			{"Computer Graphics" , "90"}
        		}
        			
        			
        		};
        System.out.println("Semester3 , Subject4: Name:" + semesters[2][3][0]);
        System.out.println("Semester3 , Subject5: Name:" + semesters[2][4][0]);
        
        System.out.println("Semester5 , Subject3: marks:" + semesters[4][2][1]);
        System.out.println("Semester5 , Subject6; marks:" + semesters[4][5][1]);
        }
	}


