import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int counter = 0; counter < 5; counter++) {
            System.out.println(counter + " ");
            int i = 0;
            while (i < 11) { //  while loop
                System.out.print(i + " ");
                i++;
                int mul;
                for (int a = 1; a <= 10; a++) {
                    mul = n * a;
                    System.out.println(mul);

                }
            }
        }
         sc.close();
    }

    }
    