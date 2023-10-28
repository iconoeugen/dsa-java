package eu.vlad.digitalstack.dsa;

import java.util.ArrayList;

public class TrianglePattern {

    private static void showTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(value + " ");
                value = value * (i-j) / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showTrianglePattern(6);
    }
}
