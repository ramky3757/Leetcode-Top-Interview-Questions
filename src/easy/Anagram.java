package easy.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";

        if (s.length() != t.length()){
            System.out.println(false);
            return;
        }

        Map<Character, Integer> result = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i),1);
            }else{
                result.put(s.charAt(i),result.get(s.charAt(i))+1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(!result.containsKey(t.charAt(i))){
                System.out.println(false);
                return;
            }else {
                result.put(t.charAt(i),result.get(t.charAt(i))-1);
            }
        }

        for(int i:result.values()){
            if(i>0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }
    public static boolean Anagram(){
        String s="anagram";
        String t="nagaram";

        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];

        for(char x : s.toCharArray()){
            count[x - 'a']++;
        }
        for(char x: t.toCharArray()){
            count[x - 'a']--;
        }
        for(int val : count){
            if(val !=0){
                return false;
            }
        }
        return true;
    }
}
