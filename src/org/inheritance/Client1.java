package org.inheritance;

public class Client1 extends Comp {
	private void clientId() {
		System.out.println("client ID : 55");

	}
	
	private void clientName() {
		System.out.println("client Name is vino");

	}
	
	
	public static void main(String[] args) {
		Client1 c1 = new Client1();
		c1.clientId();
		c1.clientName();
		c1.empId();
		c1.empName();
		c1.companyId();
		c1.compName();
		
	}

}
