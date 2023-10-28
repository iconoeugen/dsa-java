package eu.vlad.digitalstack.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseString {

    private static char[] reverse(char[] str) {
        int i = 0;
        int j = str.length - 1;

        while (i < j) {
            char c = str[i];
            str[i] = str[j];
            str[j] = c;
            i++;
            j--;
        }
        return str;
    }

    private static String reverse(String str) {
        return Arrays.toString(reverse(str.toCharArray()));
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "another";
        System.out.println("Reversed: " + reverse(s1));
        System.out.println("Reversed: " + reverse(s2));
    }
}
