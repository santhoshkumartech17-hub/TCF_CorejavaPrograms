package com.tcf.assignment_3.thiskeyword;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookStore store = new BookStore();

        // Default constructor
        Book b1 = new Book();
        b1.showDetails();
        b1.addToStore(store);

        // Parameterized constructor
        Book b2 = new Book(101, "Java Programming", "James Gosling", 499.99);
        b2.showDetails();
        b2.addToStore(store);

        Book b3 = new Book(102, "Effective Java", "Joshua Bloch", 699.50);
        b3.showDetails();
        b3.addToStore(store);

        // Returning current object
        Book returnedBook = b3.getBook();
        System.out.println("Returned Book Object: " + returnedBook);

	}

}


