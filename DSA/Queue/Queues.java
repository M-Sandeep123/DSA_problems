package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<=5;i++){
            queue.add(i);
        }

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        for(int i=0;i<queue.size();i++){
            System.out.println(queue.remove());
            System.out.println(queue);
        }

    }
}
