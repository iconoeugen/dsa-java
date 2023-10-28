package eu.vlad.digitalstack.dsa;

import java.util.ArrayList;


/*
 * Solution for https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {

    private static String getFizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(n);
    }
    private static ArrayList<String> createFizzBuzz(int n) {
        var resp = new ArrayList<String>();
        for (int i = 1; i < n; i++) {
            resp.add(getFizzBuzz(i));
        }
        return resp;
    }
    private static void showFizzBuzz(int n) {
        System.out.print(createFizzBuzz(n));
    }

    public static void main(String[] args) {
        showFizzBuzz(20);
    }
}
