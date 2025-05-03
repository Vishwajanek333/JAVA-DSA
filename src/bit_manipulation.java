import java.util.*;
public class bit_manipulation {
    public static void main(String [] args){
//        int n=5;// its Get bit(bitmask ,and(&) operation)
//        int pos=2;
//        int bitmask=1<<pos;

//        if((bitmask&n)==0){
//            System.out.println(" bit was zero");
//        }
//        else{
//            System.out.println("bit was 1");
//        }
//        System.out.println(bitmask);

//        int n=5;//Its is Set bit( bitmask ,or (|) operation)
//        int pos=1;
//        int bitmask=1<<pos;
//        int new_bit= bitmask|n;
//        System.out.println(new_bit);

//        int n=5;// clear bit(bitmask, and with notbm)
//        int pos=2;
//        int bitmask=1<<pos;
//        int notbm=~(bitmask);
//        int new_bit=(notbm&n);
//        System.out.println(new_bit);

        Scanner sc =new Scanner(System.in);
        int oper =sc.nextInt();
        //oper=1:setbit, oper =0:clearbit
        int n=5;
        int pos =1;

        int bitmask =1<<pos;
        if(oper==1){
            //set
            int newnumber =bitmask|n;
            System.out.println(newnumber);
        }else{
            //clear
            int newbitMask=~(bitmask);
            int newno =newbitMask&n;
            System.out.println(newno);
        }

        };
    }


