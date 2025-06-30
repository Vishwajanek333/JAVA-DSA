import java.util.*;

class AnagramCheck {
        public static boolean isAnagram(String str1, String str2) {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) return false;

            HashMap<Character, Integer> charCountMap = new HashMap<>();

            for (char ch : str1.toCharArray()) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }

            for (char ch : str2.toCharArray()) {
                if (!charCountMap.containsKey(ch)) {
                    return false;
                }
                charCountMap.put(ch, charCountMap.get(ch) - 1);
                if (charCountMap.get(ch) == 0) {
                    charCountMap.remove(ch);
                }
            }

            return charCountMap.isEmpty();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print(" 1st:");
            String word1 = scanner.nextLine();
            System.out.print("2nd: ");
            String word2 = scanner.nextLine();

            // Check anagram
            if (isAnagram(word1, word2)) {
                System.out.println("The words are anagrams.");
            } else {
                System.out.println("The words are NOT anagrams.");
            }

            scanner.close();
        }
    }


