import java.util.Scanner;

public class bc_1 {
        public static void main(String arg[]) {
            // to check odd or even
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println( i);
                }
                break;
            case 2:
                int j = 0;
                while (j < 5) {
                    System.out.println( j);
                    j++;
                }
                break;
            case 3:
                int k = 0;
                do {
                    System.out.println(" k");
                            k++;
                } while (k < 5);
                break;
            default:
                System.out.println("Invalid choice");

        }
        }
}
