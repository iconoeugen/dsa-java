// https://leetcode.com/problems/two-sum

package eu.vlad.digitalstack.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {
    static public List<Integer> twoSum(List<Integer> nums, int target) {
        HashSet<Integer> seen = new HashSet<Integer>();

        for (int num: nums) {
            if (seen.contains(target - num)) {
                return Arrays.asList(target-num, num);
            }
            seen.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        List<?> resp = twoSum(Arrays.asList(1, 2, 3, 4, 5), 5);

        System.out.println(resp);
    }
}
