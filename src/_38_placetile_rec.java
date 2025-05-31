public class _38_placetile_rec {
    public static int placetiles(int n,int m){
        if(n==m){
            return 2;// two arrangment possible
        }
        if(n<m){
            return 1;//one  way arr is possible
        }

        //vertical
        int vetplacements = placetiles(n-m,m);

        //horisontal
        int horizontal =placetiles(n-1,m);

         return vetplacements+horizontal;
    }

    public static void main(String args[]){
        int n=4, m=2;
       int  total= placetiles(n,m);
        System.out.println(total);

    }
}
