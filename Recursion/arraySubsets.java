// Write a method which returns the array of arrays made of subsets of given input array.


// Note : Array and ArrayList are passed by reference, 
// i.e if the changes is made in one List it will 
// reflect everywhere.

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class arraySubSets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));  // Add a copy of the current subset
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);              // Include the current element
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1); // Exclude the current element (backtrack)
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }
}