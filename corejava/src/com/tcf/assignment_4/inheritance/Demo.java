package com.tcf.assignment_4.inheritance;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("=== Student Details ===");
	        Student s1 = new Student("Riya", 20, 101, "Computer Science");
	        s1.display();

	        System.out.println("\n=== Research Student Details ===");
	        ResearchStudent rs1 = new ResearchStudent("Aaastha", 24, 201, "AI & ML", 
	                                                  "Natural Language Processing", "Dr. Ramesh");
	        rs1.display();

	        System.out.println("\n=== Teacher Details ===");
	        Teacher t1 = new Teacher("Santhosh", 35, "T101", "Java Programming");
	        t1.display();

	}

}


