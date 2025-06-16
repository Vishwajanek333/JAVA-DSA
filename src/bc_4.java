import java.util.Scanner;

public class bc_4 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System .out.println("enter the month="+num);
        if(num==1){
            System.out.println("jan");
        }
        if(num==2){
            System.out.println("feb");
        }
        if(num==3){
            System.out.println("mar");
        }

        if(num==4){
            System.out.println("apr");
        }
        else{
            System.out.println("it next months go on");
        }

    }
}
