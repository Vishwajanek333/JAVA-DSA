// Students details
class Student {
    int rollNumber;
    String name;
    int age;

    void setDetails(int r, String n, int a) {
        rollNumber = r;
        name = n;
        age = a;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class bc_7{
    public static void main(String[] args) {
        Student s = new Student(); // Uses the default constructor
        s.setDetails(101, "Rahul", 20);
        s.displayDetails();
    }
}
