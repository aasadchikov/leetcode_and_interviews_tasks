package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean IsContainsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;
    }
}
