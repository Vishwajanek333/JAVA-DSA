import java.sql.SQLOutput;
import java.util.Scanner;

public class javapratice {
    public static void main(String arg[]){
        // to check odd or even
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.print("even");
        }
        else{
            System.out.println("its odd");
        }
    }
}
