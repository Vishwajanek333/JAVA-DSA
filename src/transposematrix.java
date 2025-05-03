import java.util.*;

public class transposematrix {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] transpose_matrix= new  int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose_matrix[i][j]=sc.nextInt();
            }
        }
        //transpose
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(transpose_matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
