public class _34_reces_sub_seq {
    public static void subsequences(String str,int idx,String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char curr = str.charAt(idx);

       // to  be include the  current  char
        subsequences(str,idx+1,newstring+curr);

       // to not be exclude the  current char
        subsequences(str,idx+1,newstring);
    }
    public static void main(String[] args){
        String str ="abc";
        subsequences(str,0,"");
    }
}
