package OOPSinJAVA;

public class StudentClass {
    // creating a new data type -> multiple attribute
    public static class Student {
        String name;
        int rollNo;
        double percent;
    }

    public static class Car {
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        Student x, y;           // x and y are objects of Student Class
        x = new Student();      // declaration
        y = new Student();
        x.name = "Raghav";
        x.rollNo = 76;
        x.percent = 92.5;
        System.out.println(x.rollNo + 8);
        y.name = "Ayush";
        y.rollNo = 51;
        y.percent = 95.2;
    }
}
