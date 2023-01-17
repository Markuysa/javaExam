package reverseHalf;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,8,7,2,9,18,12,0));
        reverseHalf(queue);
    }


    static void reverseHalf(Queue<Integer> firstQ){
        Stack<Integer> stack = new Stack<>();
        int size =  firstQ.size();
        for (var i = 0;i<size;i++) {
            if (i % 2 != 0) {
                stack.push(firstQ.poll());
            }else{
                firstQ.offer(firstQ.poll());
            }
        }
        while (!stack.isEmpty()){
            firstQ.offer(firstQ.poll());
            firstQ.offer(stack.pop());
        }
        for (var i : firstQ) {
            System.out.println(i);
        }
    }
}



