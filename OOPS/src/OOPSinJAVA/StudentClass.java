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

        Student x, y;           // x and y are objects of Student Class
        x = new Student();      // declaration
        y = new Student();
        x.name = "Raghav";
        //x.rollNo = 76;
        x.setrollNo(76);
        x.percent = 92.5;
        System.out.print(x.getrollNo());
        print(x);
        changeName(x);          // same as array the value is passed by reference for a class instance
        print(x);
        y.name = "Ayush";
        y.setrollNo(51);
        y.percent = 95.2;
        print(y);
    }
}
