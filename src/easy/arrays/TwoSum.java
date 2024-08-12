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

    public static int[] twoSum(int[] nums, int target) {
        for(int p1=0; p1<nums.length; p1++){
            int numberToFind = target - nums[p1];

            for(int p2=p1+1;p2<nums.length;p2++){
                if(numberToFind == nums[p2]){
                    return new int[]{p1,p2};
                }
            }
        }
        return null;
    }
}
