package easy.strings;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        if (strs.length < 1) {
            //print empty
        }

        String preString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < preString.length()) {
                preString = strs[i];
            }
        }

        int start = 0;
        int prefix = 0;
        boolean indexMatch = true;
        while (start < preString.length()) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(start) != preString.charAt(start)) {
                    indexMatch = false;
                    break;
                }
            }
            if (indexMatch) {
                prefix++;
            } else {
                break;
            }
            start++;
        }

        System.out.println(preString.substring(0, prefix));

        System.out.println(commonPrefix(strs));
    }

    public static String commonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;

    }
}
