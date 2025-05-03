import java.util.*;

public class condition {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
        if(a==b) {
            System.out.printf("equal="+a);
        }
        else if(a>b) {
            System.out.printf("a is greater" + a);
        }
        else{
            System.out.println("a is smaller"+a);
        }
        sc.close();
    }
}