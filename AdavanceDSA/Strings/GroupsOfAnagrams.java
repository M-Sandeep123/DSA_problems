package AdavanceDSA.Strings;

import java.util.ArrayList;
import java.util.List;

public class GroupsOfAnagrams {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("god");
        list.add("act");
        System.out.println(groupsOfAnagrams(list));
    }

    private static List<List<Integer>> groupsOfAnagrams(List<String> list) {

        for(int i=0;i<list.size();i++){
            for(int j =i+1;;){

            }
        }

        return null;
    }
}
