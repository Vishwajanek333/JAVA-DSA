public class _33_recession_duplicate {

    public static boolean[] map = new boolean[26]; // To store whether a character has appeared
    // intitally  all values  are false in map
    public static void removeDuplicate(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {// it  chk  for char not seen befor
            //(!) it  tell about the  char is new char
            newStr += currChar;
            map[currChar - 'a'] = true;
        }

        removeDuplicate(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }
}
// brute for apporch
//public class RemoveDuplicatesBruteForce {
//
//    public static void main(String[] args) {
//        String str = "abbccda";
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//            boolean isDuplicate = false;
//
//            // Check if currentChar already exists in result
//            for (int j = 0; j < result.length(); j++) {
//                if (result.charAt(j) == currentChar) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            // If not duplicate, add to result
//            if (!isDuplicate) {
//                result += currentChar;
//            }
//        }
//
//        System.out.println(result);
//    }
//}

