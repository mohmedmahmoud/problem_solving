package com.problem_solving;

/**
 * Hello world!
 *
 */
public class App {
    // ----------------------------probleme 1

    int indexCherche(int target, int[] nums) {
        int val = nums.length / 2;
        if (nums[val] == target) {
            return val;
        } else if (nums[val] < target) {
            for (int i = ++val; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }

        } else {
            for (int j = --val; j >= 0; j--) {
                if (nums[j] == target) {
                    return j;
                }

            }
        }
        return -1;
    }

    boolean isBadVersion(int version) {
        return true;
    }

    //  -------------------------------------problem 2
    int badVersion(int[] nums) {
        for (int version : nums) {
            if (isBadVersion(version)) {
                return version;
            }
        }
        return -1;
    }

    //  -------------------------------------problem 3
    static int[] sumTwoNumberList(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {

                    int[] array = {i, j};
                    return array;
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {

        // -------------------------debut ---probleme 1
        int[] nums = {2, 5, 8, 12, 16, 28, 38, 56, 72, 91};
        int target = 7;
        // int index = indexCherche(target, nums);
        // if (index != -1) {
        //     System.out.println("Target found at index: " + index);
        // } else {
        //     System.out.println("Target not found.");
        // }
        // -------------------------fin ---probleme 1

        // =================================problem 3
        int[] results = sumTwoNumberList(nums, target);
        for (int val : results) {
            System.out.println(val);
        }

    }
}
