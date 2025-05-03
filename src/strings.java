import java.util.*;
public class strings {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String user_name = sc.nextLine();
        String college = sc.nextLine();
//        String name = "vishwa";
//        String sentence = "Good Morning  Everyone ";
         String university =user_name+" "+college;// concatenation
        System.out.println(university);
        System.out.println(university.length());// lenth  name.length()

        // chartAT: it will print all characters  from given string
        for(int i=0;i<university.length();i++){
            System.out.println(university.charAt(i));
        }

        //System.out.printf(sentence);
    }
}
