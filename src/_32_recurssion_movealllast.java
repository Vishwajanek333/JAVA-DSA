public class _32_recurssion_movealllast {
    public static void moveall(String str, int idx, int count, String newstring) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveall(str, idx + 1, count, newstring);
        } else {
            newstring += currChar;
            moveall(str, idx + 1, count, newstring);
        }
    }

    public static void main(String args[]) {
        String str = "axbxxcxd";
        moveall(str, 0, 0, " ");
    }
}


