import java.util.HashSet;

public class _35_recss_unq_seq {

    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) { //  use
            if (!set.contains(newString)) { // the newstring does not present in the set
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }

        char curr = str.charAt(idx);

        // Include the current character
        subsequences(str, idx + 1, newString + curr, set);

        // Exclude the current character
        subsequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
