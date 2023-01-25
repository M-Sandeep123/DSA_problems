package AdavanceDSA.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String args[]){
        String str = "abcabcbb";
        System.out.println(longestSubString(str));
    }

    private static int longestSubString(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        int stringLength = 0;
        String subString = null;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!map.containsKey(i)){
                map.put(str.charAt(i),i);
            }else {
                i = map.get(ch);
                map.clear();
            }
            if(stringLength<map.size()){
                stringLength = map.size();
                subString = map.toString();
            }
        }

        return stringLength;
    }
}
