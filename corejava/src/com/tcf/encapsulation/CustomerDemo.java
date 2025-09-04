package com.tcf.encapsulation;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCid(17);
		c1.setName("Santhosh");
		c1.setCity("Cuddalore");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setCid(18);
		c2.setName("Aaastha");
		c2.setCity("Delhi");
		System.out.println(c2);
		
		Customer c3 = new Customer();
		c3.setCid(19);
		c3.setName("Riya");
		c3.setCity("ooty");
		System.out.println(c3);

	}

}
