public class bc_2 {
    public static void main(String args[]) {
        // palandrome number
        int n = 121;
        int original=n;
        int reverse = 0;
        int digit;

        while (n != 0) {
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n /10;
        }
            if (original== reverse) {
                System.out.print("Palindrome");
            } else {
                System.out.print("Not Palindrome");
            }
        }
    }


