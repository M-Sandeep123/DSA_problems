package AdavanceDSA.Strings.StringMatching;

public class BruteForce {
    public static void main(String args[]){
        String to_search_for = "abc";
        String to_search_in = "jjhjhvjhvhhbabcdod";

        System.out.println(findSubstring(to_search_for,to_search_in,to_search_in.length()));
        System.out.println(findSubstring(to_search_for,to_search_in));

    }

    private static boolean findSubstring(String to_search_for, String to_search_in, int length) {
        int pt=0;
        for(int i=0;i<length;i++){
            if(to_search_in.charAt(i)==to_search_for.charAt(pt)){
                pt++;
            }else {
                pt = 0;
            }
            if(pt == to_search_for.length()) return true;
        }

        return false;
    }

    static int findSubstring(String s1, String s2)
    {
        int length_1 = s1.length();
        int length_2 = s2.length();

        for (int i = 0; i <= length_2 - length_1; i++) {
            int j;

            for (j = 0; j < length_1; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;

            if (j == length_1)
                return i;
        }

        return -1;
    }
}
