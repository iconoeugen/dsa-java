package eu.vlad.digitalstack.dsa;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private static boolean anagram(String str1, String str2) {
        Map<Character, Integer> count = new HashMap<Character, Integer>();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int idx = 0; idx < str1.length(); idx++) {
            char c1 = str1.charAt(idx);
            char c2 = str2.charAt(idx);
            if (count.containsKey(c1)) {
                count.put(c1, count.get(c1) + 1);
            } else {
                count.put(c1, 1);
            }
            if (count.containsKey(c2)) {
                count.put(c2, count.get(c2) - 1);
            } else {
                count.put(c2, -1);
            }

            if (count.get(c1) == 0) {
                count.remove(c1);
            }
            if (count.containsKey(c2) && count.get(c2) == 0) {
                count.remove(c2);
            }
        }
        return count.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Contain pairs: " + anagram("blah", "hlab"));
        System.out.println("Contain pairs: " + anagram("foo", "boo"));
        System.out.println("Contain pairs: " + anagram("foo", "alice"));
    }
}
