public class _27_recression_logn_heigtht {
    public class recression26 {// power of height
        public static int calpow(int x,int n){
            if(n==0){
                return 1;
            }
            if(x==0){
                return 0;
            }
            if(n%2==0){// even
                return calpow(x,n/2)*calpow(x,n/2);
            }
            else{
               return  calpow(x,n/2)*calpow(x,n/2)*x;
            }
        }
        public static void main(String args[]){
            int x=2,n=5;
            int ans =calpow(x,n);
            System.out.println(ans);
        }
    }

}
