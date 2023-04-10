package org.System;

public class Desktop extends Computer {

	protected void desktopSize() {
		// TODO Auto-generated method stub
System.out.println("Desktop size is 15.6' inches");
	}
	
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
