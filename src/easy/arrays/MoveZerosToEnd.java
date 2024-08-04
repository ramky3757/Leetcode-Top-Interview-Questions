package easy.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums= {0,1,0,3,12};
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        for(int k=i;k<nums.length;k++){
            nums[k]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
