package DSA.stack;

import java.util.Stack;

public class Infix_Prefix {
    public static void main(String args[]){
        String infix = "8+(7-9)*2";
        System.out.println(infixToPrefix(infix));
    }

    private static String infixToPrefix(String infix) {
        char str[] = infix.toCharArray();
        int i=0,j=str.length-1;
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return conversion(str);
    }

    private static String conversion(char[] infix) {
        
        return "";
    }
}
