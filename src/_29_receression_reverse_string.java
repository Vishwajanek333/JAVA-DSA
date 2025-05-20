
//import java.util.*;
//public class _29_receression_reverse_string { // simple for loop reverse
//    public static void main(String args[]){
//    Scanner scn =new Scanner(System.in);
//    String name=scn.nextLine();
//    System.out.println("name=" + name);
//    String revers ="";
//    for(int i=name.length()-1;i>=0;i--){
//        revers+=name.charAt(i);
//        System.out.println( revers);
//         }
//    }
//}
// using  recerssion
public class _29_receression_reverse_string {
public  static void printrev(String str, int index){
    if(index==0){
        System.out.println(str.charAt(index));
        return;
    }

    System.out.print(str.charAt(index));
    printrev(str,index-1);
}
public static void main (String  args[]){
    String str ="abcd";
    printrev(str,str.length()-1);

}
}