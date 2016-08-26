package round1.arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.

 * Created by xingfeiy on 6/22/16.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums1) {
            set.add(i);
        }

        Set<Integer> result = new HashSet<>();
        for(int i : nums2) {
            if(set.contains(i)) {
                result.add(i);
            }
        }

        int[] array = new int[result.size()];
        int index = 0;
        for(int value : result.toArray(new Integer[result.size()])) {
            array[index++] = value;
        }

        return array;
    }
}
