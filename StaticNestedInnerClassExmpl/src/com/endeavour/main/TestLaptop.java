package com.endeavour.main;

public class TestLaptop {

	public static void main(String[] args) {

		Laptop lp = new Laptop("Dell", "inspiron", "Windows 10");
		lp.laptopSpecification();
		System.out.println();
		Laptop.Mouse mouse = new Laptop.Mouse("hp");
		mouse.mouseInfo();
		
	}

}
