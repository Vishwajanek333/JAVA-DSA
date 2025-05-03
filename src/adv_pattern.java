import java.util.*;

public class adv_pattern {
    public static void main(String args[]) {
        int n=5;
        for (int i=1; i<=n;i++) {
            for (int j=i; j<=i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2part
            for (int j=i; j<=i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
        // lower half
        for (int i = 4; i <= n; i++) {
            for (int j = i; j >= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //2part
            for (int j = i; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}



