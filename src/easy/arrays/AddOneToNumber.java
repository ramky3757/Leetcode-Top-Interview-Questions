package easy.arrays;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] nums = {9};
        if (nums[nums.length-1]!=9){
            nums[nums.length-1]=nums[nums.length-1]+1;
            System.out.println(Arrays.toString(nums));
        } else {
            int j = nums.length-1;
                    while(j>=0 && nums[j]==9){
                        nums[j] = 0;
                        j--;
                    }
              if(j==-1){
                  int[] result = new int[nums.length+1];
                  result[0] = 1;
                  System.out.println(Arrays.toString(result));
              } else{
                  nums[j]=nums[j]+1;
                  System.out.println(Arrays.toString(nums));
              }
        }
    }
}
