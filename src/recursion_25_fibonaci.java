//public class recursion_25_fibonaci {// its  is  general method
//    public static void main(String args[]){
//        int n=7;int b=1;int a=0;
//        for(int i=0;i<n;i++){
//            System.out.println(a + " ");
//            int c=a+b;
//            a=b;
//            b=c;
//
//        }
//    }
//}
// recresion fibonacci
public class recursion_25_fibonaci {
    public  static  void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);
    }
    public static void main(String args[]){
        int a=0; int b=1;int n=7;
        System.out.println(a);
        System.out.println(b);
        printfib(a,b,n-2);// call by value
    }
}

