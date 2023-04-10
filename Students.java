package org.Student;

public class Students {
	
	
	protected int getStudentInfo(int id) {
		return id;
		
	}
	
	protected String getStudentInfo(int id, String name) {
		return id+"  "+name;
		
	}

	protected String getStudentInfo(String emailid, long phoneno) {
		return emailid+"  "+phoneno;
		
	}
	
	public static void main(String[] args) {
		

		Students std=new Students();
		int a=std.getStudentInfo(51);
		String b=std.getStudentInfo(51, "Venkatesh");
		String c=std.getStudentInfo("svenkats30@gmail.com", 7397455283L);
		System.out.println("Student ID:  "+a);	
		System.out.println("Student ID and Name:    "+b);
		System.out.println("Student Email-ID and Phone Number: "+c);
		
	}

}
