package easy.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] str = s.toCharArray();
        Map<Character,Integer> result = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i),1);
            }else{
                result.put(s.charAt(i),result.get(s.charAt(i))+1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(result.get(s.charAt(i))==1){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
