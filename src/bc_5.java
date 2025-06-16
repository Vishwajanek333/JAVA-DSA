import java.util.Scanner;

public class bc_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        int gradeCategory;
        if (marks > 95) {
            gradeCategory = 1; // A
        } else if (marks > 85) {
            gradeCategory = 2; // B
        } else if (marks > 75) {
            gradeCategory = 3; // C
        } else {
            gradeCategory = 4; // fail
        }

        switch (gradeCategory) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("fail");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
