package easy.strings;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -123;
        int reversedNum = 0;

        while(num!=0){
            int temp = num%10;
            num = num/10;

            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && temp > 7)) {
                return ; // Return 0 to indicate overflow
            }

            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && temp < -8)) {
                return ; // Return 0 to indicate overflow
            }

            reversedNum = reversedNum *10 + temp;
        }

        System.out.println(reversedNum);
    }
}
