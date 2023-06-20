class Student {
    int rollNo;
    String name;
    // Default Constructor
    Student() {
        rollNo = 0;
        name = "";
    }
    // Parameterized Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    // Copy Constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class DiffConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Rahul");
        Student s3 = new Student(s2);
        System.out.println("Student 1: ");
        s1.display();
        System.out.println("Student 2: ");
        s2.display();
        System.out.println("Student 3: ");
        s3.display();
    }
}
