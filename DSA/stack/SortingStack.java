package DSA.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class SortingStack {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(56);
        list.add(10);
        list.add(5);
        list.add(7);
        System.out.println(sortStack(list));
    }

    private static List<Integer> sortStack(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for(int i=0;i<list.size();i++){
            stack.push(list.get(i));
        }

        while (!stack.isEmpty()){
            int ele = stack.pop();
            if(stack2.isEmpty()|| stack2.peek()>=ele){
                stack2.push(ele);
            }else{
                while (stack2.peek()<ele){
                    stack.push(stack2.pop());
                    if(stack2.isEmpty()){
                        break;
                    }
                }
                stack2.push(ele);
            }
        }
        list.removeAll(list);
        while(!stack2.isEmpty()){
            int ele = stack2.pop();
            list.add(ele);
        }
        return list;
    }
}
