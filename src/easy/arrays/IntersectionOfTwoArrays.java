package src.easy.arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,2};
        List<Integer> finalResult = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<>();

        if (nums1.length > nums2.length){
            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])) {
                    map.put(nums1[i], map.get(nums1[i]) + 1);
                } else{
                    map.put(nums1[i], 1);
                }
            }
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                    finalResult.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i])) {
                    map.put(nums2[i], map.get(nums2[i]) + 1);
                } else{
                    map.put(nums2[i], 1);
                }
            }
            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i]) && map.get(nums1[i]) > 0) {
                    finalResult.add(nums1[i]);
                    map.put(nums1[i], map.get(nums1[i]) - 1);
                }
            }
        }
        int counter =0;
        int[] result= new int[finalResult.size()];
        for(int i:finalResult){
            result[counter]=i;
            counter++;
        }
        //return result;
        System.out.println(finalResult);
        System.out.println(Arrays.toString(result));
    }
}
