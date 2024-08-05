package easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        Map<Integer, Integer> result = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(result.containsKey(target-nums[i])){
                System.out.println(result.get(target-nums[i])+" "+i);
                return;
            }else{
                result.put(nums[i],i);
            }
        }
        System.out.println("no matching key");
    }
}
