public class _36_keypad_rec {
    public static String []keypad={".","abc","def","ghi","jkl","mno","pqrs"};

    public static void printcomb(String str, int idx,String com ) {
        if (idx == str.length()) {
            System.out.println(com);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];
        {

            for (int i = 0; i < mapping.length(); i++) {
                printcomb(str, idx + 1, com + mapping.charAt(i));
            }
        }
    }
    public static void main(String args[]){
            String str ="23";
            printcomb(str,0,"");
        }
}
