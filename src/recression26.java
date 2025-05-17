public class recression26 {// power of height
    public static int calpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpower=calpow(x,n-1);
        int xpow =x*xpower;
        return xpow;
    }
    public static void main(String args[]){
        int x=2,n=5;
        int ans =calpow(x,n);
        System.out.println(ans);
    }
}
