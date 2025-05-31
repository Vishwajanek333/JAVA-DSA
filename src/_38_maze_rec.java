public class _38_maze_rec {
    public static int countpaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i== n-1 && j==m-1){
            return 1;
        }

        //move downwards
        int downpaths = countpaths(i+1,j,n,m);

        // move rights
        int rightpaths = countpaths(i,j+1,n,m);

        return downpaths+rightpaths;
    }
    public  static void main(String args[]){
        int n=3,m=3;
        int total_path=countpaths(0,0,n,m);
        System.out.println(total_path);
    }
}
