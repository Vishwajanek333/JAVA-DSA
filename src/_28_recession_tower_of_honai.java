public class _28_recession_tower_of_honai {
    public static void towerhonai(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("TRANSFER DISK"+n+"from "+src +"to"+dest);
            return;
        }

        towerhonai(n-1,src,dest,helper);
        System.out.println("TRANSFER DISK"+n+"from "+src +"to"+dest);
        towerhonai(n-1,helper,src,dest);

    }
    public static void main(String args[]){
        int n=3;
        towerhonai(n,"S","H","D");
    }// time complexity O(2^n)
}

