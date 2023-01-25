package AdavanceDSA.Strings;

import java.util.HashMap;

public class AnagramOrNot {
    public static void main(String args[]){
        String str1 = "cat";
        String str2 = "act";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!= str2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i),0)+1);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }

        return map1.equals(map2);
    }
}
