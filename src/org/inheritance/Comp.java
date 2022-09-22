package org.inheritance;

public class Comp extends SingleInherit {
	
	public void companyId() {
		System.out.println("company id:55");
	}
	
	public void compName() {
		System.out.println("company name:TCS");

	}
	
	public static void main(String[] args) {
		Comp c = new Comp();
		c.companyId();
		c.compName();
		c.empId();
		c.empName();
		
		
	}

}
