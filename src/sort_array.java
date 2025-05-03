import java.util.*;
public class sort_array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];


        // input
        for(int i=0;i<size;i++) {
             num[i] = sc.nextInt();
        }
        // check  array is sort

        boolean isSorted =true;

        for(int i=0;i<size;i++){
            if (num[i] > num[i+1]) {
                isSorted=false;
                break;

            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
        }

        sc.close();


        }
    }


