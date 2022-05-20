package org.test;

public class Hotel extends Customer {
 @Override
public void recipe() {
System.out.println("secret");	
}
 public static void main(String[]arg) {
	 Hotel h = new Hotel();
	 h.menu();
	 h.price();
	 h.recipe();
	 
 }
 
}
