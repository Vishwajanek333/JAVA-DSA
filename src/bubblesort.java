public class bubblesort {
    public static  void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        //bubble sort// time complexity O(n^2)
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
    }
}
