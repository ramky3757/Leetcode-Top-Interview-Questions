package src.easy.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        Set<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (duplicates.contains(num)) {
                System.out.println("Duplicate found: " + num);
            } else{
                duplicates.add(num);
            }
        }
    }
}
