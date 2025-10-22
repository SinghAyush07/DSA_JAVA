package oopsinJAVA;

public  class Student {
	String name;
	int rollNo;
	double percent;
	final String schoolName = "Jawahar Vidya Mandir";		// cannot be changed
	private static int numberOfStudents;
	
	public int getrollNo() {	// getter
		return rollNo;
	}
	
	public void setrollNo(int rollNo) {	// setter
		this.rollNo = rollNo;
	}
	
	public static int getNumberOfStudents() {// adding static allows class to read value without the need to initialse an instance
		return numberOfStudents;
	}
	// Default Constructor
	public Student() {
		
	}
	
	// constructor
	public Student(String name, int rollNo, double percent) { 
		this.name = name;
		this.rollNo = rollNo;
		this.percent = percent;
		numberOfStudents++;
	}
}