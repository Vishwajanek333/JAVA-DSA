import java.util.*;
//
//public class arrays {
//    public static void main(String args[]){
//        int marks[]={30,45,67};
////        int marks[]= new int[3];
////        marks[0]= 98;
////        marks[1]=87;
////        marks[2]=67;
//////        System.out.println(marks[0]);
//        for(int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }
//    }
//}


//public class arrays {// automatic intialized of zeros
//    public static void main(String args[]){
//        Scanner sc =new Scanner(System.in);
//        int size = sc.nextInt();// not here it will same for  all int,float date types
//        float numbers[] =new float[size];;// if given float it will store has 0.0
//
//        for(int i=0;i<size;i++){
//            System.out.println(numbers[i]);
//        }
//    }
//}

//public class arrays {// automatic intialized of zeros
//    public static void main(String args[]){
//        Scanner sc =new Scanner(System.in);
//        int size=sc.nextInt();
//        int numbers[] =new int[size];
//
//        //intput floop // it  take  inputs numbers
//        for(int i=0;i<size;i++){
//            numbers[i]=sc.nextInt();
//        }
//        // output loop
//        for(int i=0;i<size;i++){
//            System.out.println(numbers[i]);
//        }
//    }
//}
public class arrays {// search the x  value  with index value

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //intput floop // it  take  inputs numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
           int x = sc.nextInt();// its like transversal: check the each array of index element

            //output loop
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == x) {
                    System.out.println("x found at index:" + i);
                }
                else{
                    System.out.println("element not not define");
                }
            }
        }
    }
