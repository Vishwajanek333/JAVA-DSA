public class _37_perm_recess {// permution of string
    public static void printperm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return ;

        }
        for(int i=0;i<str.length();i++){
            char currchar =str.charAt(i);
            //"abc"->"ab" we take c as first
            String newstr =str.substring(0,i)+str.substring(i+1);// her sub sting (0,0 ) it  take "", but  sec substring (1,)it means  it from bto las all lettres=(bc)
            printperm(newstr,permutation+currchar);
        }
    }
    public static void main(String args[]){
        String str ="abc";
        printperm(str,"");
    }
}

