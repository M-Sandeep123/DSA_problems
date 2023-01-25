package DSA;

import java.util.Arrays;

public class Ibm2 {
    public static void main(String args[]){
        int digits=3;
        String userId = "user1";
        String password = "pass1";
        logIn(digits,userId,password);
    }

    private static void logIn(int digits, String userId, String password) {

        String id[] = userId.split("user");
        String passId[] = password.split("pass");
        System.out.println(Arrays.toString(id) +" "+Arrays.toString(passId));

       if(!id[1].equals(passId[1])){
           System.out.println("userID and password are not valid plz try again");
           return;
       }

       int palindrom = generatePalindrom(digits);
        System.out.println("welcome "+userId+" and the generated token is token-"+palindrom);
    }

    private static int generatePalindrom(int digits) {
        int num[] = {1,11,101,1001,10001,100001,1000001,1000001,100000001,100000001};
        return num[digits-1];
    }
}
