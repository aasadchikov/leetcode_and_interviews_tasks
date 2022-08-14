package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class reverseArray {

    public static List<String> reverseArray(List<String> data) {
        // Write your code here
        List<String> revArray = new ArrayList<>();
        for (int i = data.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revArray.add(data.get(i));
        }

        // Return the reversed arraylist
        return revArray;

    }

}
