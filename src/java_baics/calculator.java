import java.util.*;
public class calculator {
    public static void main(String[] args){
        System.out.println("enter the values of a,b");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        char operator =sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("add="+(a+b));
                break;
            case '-':
                System.out.println("sub="+(a-b));
                break;
            case '*':
                System.out.println("mul="+(a*b));
                break;
            case '/':
                System.out.println("div="+(a/b));
                break;
            case '%':
                System.out.println("mod="+(a%b));
                break;
            default:
                System.out.printf("invalid");
        }
        sc .close();
    }
    
}
