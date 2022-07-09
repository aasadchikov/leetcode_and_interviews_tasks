package LeetCode;

public class RemoveDuplicates {

    public static int[] removeDuplicatesFromSortedArray(int[] nums) {
        if (nums.length == 0) return nums;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int[] result = new int[i + 1];
        for (i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }

        return result;
    }
}
