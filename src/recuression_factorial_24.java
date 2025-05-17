public class recuression_factorial_24 {
    public static  int  printfactor(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact1=printfactor(n-1);
        int fact2=n*fact1;
        return fact2;

    }
    public static void main(String [] args){
       int n=5;
       int ans= printfactor(n);// directly  use 5 also no need  of varible creating.
        System.out.println(ans);

    }

}
