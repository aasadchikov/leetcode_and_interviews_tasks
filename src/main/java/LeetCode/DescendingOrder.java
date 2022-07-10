package LeetCode;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static Integer[] sortDec(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
