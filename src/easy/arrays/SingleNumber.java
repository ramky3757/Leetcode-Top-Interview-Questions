package src.easy.arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[]nums = {2,1,2};

        int result = 0;
        for(int i:nums){
            result ^= i; //XOR operation - if it finds duplicate element in array, it makes result 0 (4^4=0). So, which ever is non zero, that's result
        }

        System.out.println(result);
    }
}
