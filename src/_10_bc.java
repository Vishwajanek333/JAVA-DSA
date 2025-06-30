import java.util.*;

class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        // map the char
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // uniq char get
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "loveleetcode";
        int result = firstUniqChar(input);
        System.out.println("First unique character index: " + result);
    }
}
