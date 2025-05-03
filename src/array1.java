import java.util.*;
public class array1 { // max and min
    public static void main(String[] args){
        Scanner  scn= new Scanner(System.in);
        int size = scn.nextInt();
        int [] numbers =new int[size];


        for(int i=0;i<size;i++){
            numbers[i]= scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];

                }
            }
        }
            System.out.println("max="+max);
            System.out.println("min="+min);

     }
  }
