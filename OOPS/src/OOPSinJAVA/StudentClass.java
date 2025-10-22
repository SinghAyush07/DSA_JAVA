package oopsinJAVA;

public class StudentClass {
//	public static class Student {
//        String name;
//        int rollNo;
//        double percent;
//    }

    public static void print (Student s) {
        System.out.println(s.name);
        System.out.println(s.getrollNo());
        System.out.println(s.percent);
        System.out.println(s.schoolName);
    }
    public static void changeName (Student s) {
        s.name = "Rohan";
    }
    public static void main(String[] args) {
        // class Student {                  // class can also be declared within a function or a method
        //     String name;
        //     int rollNo;
        //     double percent;
        // }

//        Student x, y;           // x and y are objects of Student Class
//        x = new Student();      // declaration
//        y = new Student();
//        x.name = "Raghav";
//        //x.rollNo = 76;
//        x.setrollNo(76);
//        x.percent = 92.5;
//        System.out.print(x.getrollNo());
//        print(x);
//        changeName(x);          // same as array the value is passed by reference for a class instance
//        print(x);
//        y.name = "Ayush";
//        y.setrollNo(51);
//        y.percent = 95.2;
//        print(y);

    	
//    	Student s1 = new Student();		// uses default constructor
//    	s1.name = "Raghav";
//    	s1.rollNo = 76;
//    	s1.percent = 92.5;
//    	// s1.schoolName = "DPS";
//    	// System.out.println(s1.schoolName);
//    	
//    	Student s2 = new Student("Ayush", 51, 95.2);	// uses the constructor we made
//    	print(s1);
//    	print(s2);
    	
    	// some interesting thing about static
//    	System.out.println(Student.numberOfStudents);
//    	Student.numberOfStudents = 100;
//    	System.out.println(Student.numberOfStudents);
//    	To prevent this add private to before static and create getter for it
    	System.out.println(Student.getNumberOfStudents());
    	
    	Student s1 = new Student("Raghav", 76, 92.5);
    	// System.out.println(s1.numberOfStudents);	-> 1
    	Student s2 = new Student("Ayush", 51, 95.2);
    	// System.out.println(s2.numberOfStudents);	-> 2
    	Student s3 = new Student("Rahul", 86, 82.8);
    	// System.out.println(s3.numberOfStudents);	-> 3
    	System.out.println(s1.getNumberOfStudents());
    	System.out.println(s2.getNumberOfStudents());
    	System.out.println(s3.getNumberOfStudents());
    }
}
