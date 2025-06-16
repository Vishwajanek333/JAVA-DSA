import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class bc_6 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int n =sc.nextInt();
        int eve=0;
        int odd =0;
        for(int i =0;i<=n;i++){
            if(i%2==0){
                eve+=i;
            }
            else{
                odd+=i;
            }
        }
        System.out.println("eve="+eve);
        System.out.println("odd="+odd);
    }
}
