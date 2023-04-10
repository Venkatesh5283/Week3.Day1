package org.Student;

public class AxisBank extends BankInfo {

	
	protected void deposit() {
		// TODO Auto-generated method stub
System.out.println("Axis Bank Class - Deposit method was overrided");
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
