import java.util.*;

public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x =sc.nextInt();
//        //output
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               //compare
               if(numbers[i][j]==x){
                   System.out.println("x is found ="+i+j);
               }
           }

        }
    }
}
