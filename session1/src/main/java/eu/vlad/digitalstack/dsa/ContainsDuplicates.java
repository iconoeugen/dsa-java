package eu.vlad.digitalstack.dsa;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static int countPairs(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        int pairs = 0;

        for (int num: nums) {
            if (seen.contains(num)) {
                pairs++;
                seen.remove(num);
            } else {
                seen.add(num);
            }
        }
        return pairs;
    }

    public static boolean hasDuplicates(int[] nums) {
        return countPairs(nums) != 0;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4, 5, 4};
        int[] anotherArray = {1, 2, 3, 4, 1};
        System.out.println("Contain pairs: " + countPairs(array));
        System.out.println("Contain pairs: " + countPairs(anotherArray));
    }
}
