package AdavanceDSA.Strings;


import java.lang.reflect.Array;
import java.util.*;

/** Problem statement :
 * String str is called good if there are no two different characters in str that have the same frequency.
 *
 * Given string str, return the minimum number of characters you need to delete to make string str good.
 */


public class MinNumCharacters {
    public static void main(String args[]){
        String str = "aabb";
        int num = minDeletions(str);
        System.out.println(num);
    }

    private static int minDeletion(String str) {
        HashMap<Character,Integer> map = new HashMap();

        for(int i=0; i < str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int freq = map.get(str.charAt(i))+1;
                map.put(str.charAt(i),freq);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        int count = 0, i = 0;
        int arr[] = new int[map.size()];
        Iterator<Integer> val = map.values().iterator();
        while (val.hasNext()){
            arr[i] = val.next();
            i++;
        }
        for(i=0;i< arr.length;i++){
            int c=0,fre=arr[i];
            while (fre>0 && checkExist(arr,i,fre)){
                fre--;
                c++;
            }
            count+=c;
            arr[i] = fre;
        }
        System.out.println(count);
        return 0;
    }

    public static boolean checkExist(int arr[],int index,int fre){
        for(int i=0;i<arr.length;i++){
            if(fre==arr[i]&&i!=index){
                return true;
            }
        }
        return false;
    }
        public static int minDeletions(String str) {
            int n = str.length();
            Map<Character, Integer> characterMap = new HashMap<>();
            for(int i=0;i<n;i++) {
                characterMap.put(str.charAt(i), characterMap.getOrDefault(str.charAt(i), 0) + 1);
            }
            int ans = 0;
            Set<Integer> set = new HashSet<>();
            for(Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();
                while(set.contains(value) && value!=0) {
                    value--; ans++;
                }
                set.add(value);
            }
            return ans;
        }
}

