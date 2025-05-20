public class _31_reucression_issort {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){ // strictly increaese
            return true;
        }


        if(arr[idx]<arr[idx+1]){
            //arr is sorted
            return isSorted(arr,idx+1);
        }else{
            return false;
        }


        }
        public static void main(String  args[]){
        int arr[]={1,3,2,4};
            System.out.println(isSorted(arr,0));
        }
    }

