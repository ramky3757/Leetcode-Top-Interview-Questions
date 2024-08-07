package easy.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if(s==null){
            //false
        }
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            if(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            if(s.charAt(start)!=s.charAt(end)){
                System.out.println(false);
                return;
            }
            start++;
            end--;
        }
        System.out.println(true);
    }
}
