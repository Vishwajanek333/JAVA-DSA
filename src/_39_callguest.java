public class _39_callguest {// inviting the guest in the party
    public static int callguest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int ways1=callguest(n-1);// person can come alone call

        //pair
        int ways2=(n-1)*callguest(n-2);// person can  be pair call

        return ways1+ways2;
    }
    public static void main(String args[]){
        int n=4;
        int  total=callguest(n);
        System.out.println(total);
    }
}
