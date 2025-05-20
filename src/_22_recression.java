import java.util.*;
public class _22_recression {
    public static void printnumber(int n){// print the  number 1,2,3,4,5.
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumber(n+1);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int n= sc.nextInt();
        printnumber(n);// call fn
    }
}
