
import java.util.*;

public class functions {
//        public static void MyName(String name){
//            System.out.print(name);
//            return;
//        }
//        public static void main(String args[]){
//            Scanner snc = new Scanner(System.in);
//            String name = snc.nextLine();
//            MyName(name);// fn call
//

//          public static int sum(int num1,int num2){
//              System.out.print("sum="+(num1+num2));
//              return 0;
//        }
//        public static void main(String args[]){
//              Scanner snc = new Scanner(System.in);
//              int num1 =snc.nextInt();
//              int num2 =snc.nextInt();
//
//              sum(num1,num2);

//    public static int mul(int num1,int num2){
//        System.out.print("mul="+(num1*num2));
//        return 0;
//    }
//    public static void main(String args[]){
//        Scanner snc = new Scanner(System.in);
//        int num1 =snc.nextInt();
//        int num2 =snc.nextInt();
//
//        mul(num1,num2);
    public static void printfacatorial(int n) {
        //loop
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        printfacatorial(n);
        sc.close();
       } 
     }



