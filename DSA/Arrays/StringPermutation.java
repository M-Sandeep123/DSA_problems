package DSA.Arrays;

public class StringPermutation {
    public static void main(String args[]){
        String str = "ABCD";
        permutation(str,0,str.length()-1);
    }

    private static void permutation(String str, int st, int end) {
        if(st == end){
            System.out.println(str);
            return;
        }

        for(int i=st;i<=end;i++){
            str = swap(str,st,i);
            permutation(str,st+1,end);
            str = swap(str,st,i);
        }
    }

    private static String swap(String str, int st, int i) {
        char arr[] = str.toCharArray();
        char temp = arr[st];
        arr[st] = arr[i];
        arr[i] = temp;
        return String.valueOf(arr);
    }
}
