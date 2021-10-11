package com.gale.domain;

public class Bar {
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void wuzzle(Bar bar) {
		//do something fantastic
	}
	
	public void testprivate() {
		System.out.println("test private");
		testprivate1();
		
	}
	
	private void testprivate1() {
		System.out.println("test private 1");
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
