package src.easy.arrays;

public class RotateArray {
    // this is with using extra space
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k =3;

        if(nums.length <2){
            System.out.println("Not enough elements");
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int pos = (i+k) % k ;
            result[pos] = nums[i];
        }
    }

    // Best approach without space
    public static void reverseArray(int[] nums, int k){
        rotate(nums,0, nums.length-1);
        rotate(nums,k,nums.length-1);
        rotate(nums,0,k-1);
    }

    public static void rotate(int[] nums, int start, int end ) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }

}
