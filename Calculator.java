package week3.Day1;

public class Calculator {
	
	protected int add(int a, int b) {
		return a+b;

	}
	
	protected int add(int a, int b, int c) {
		// TODO Auto-generated method stub
return a+b+c;
	}
	
	
	protected double mul(int a, double b) {
		// TODO Auto-generated method stub
return a*b;

	}
	
	protected double mul(double a, double b) {
		// TODO Auto-generated method stub
return a*b;

	}
	
	

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		int f=cal.add(12, 19);
		System.out.println("Over Loading add Method 1 : "+f);
		int e=cal.add(11, 12, 13);
		System.out.println("Over Loading add Method 2 : "+e);
		
		double d=cal.mul(12, 7.72);
		System.out.println("Over Loading Multiply Method 1 : "+d);
		
		double z=cal.mul(11.22, 7.72);
		System.out.println("Over Loading Multiply Method 2 : "+z);		
	}

}
