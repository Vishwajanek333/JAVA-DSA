import java.util.*;

//public class recression1 {
//    public static int multily2numbers(int a,int b) {
//        int product=a*b;
//        return product;
//    }
//
//    public static void main(String[] arry) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int product =multily2numbers(a, b);// call the  function
//        System.out.println("multily2numbers="+product);
//    }
//}
//public  class recression1{ // it  not works for negative numers.
//    public static int factorial(int num){
//        int fact=num*(num-1);
//        return fact;
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int num =sc.nextInt();
//        int fact =factorial(num);
//        System.out.println("facatorial of  number="+fact);
//    }
//}
public  class recression1 { // it  not works for negative numers.
    public static void factorial(int n) {
        //loops
        if (n < 0) {
            System.out.println("invalid");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();

            factorial(n);

        }
    }




