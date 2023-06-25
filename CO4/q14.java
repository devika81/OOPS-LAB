import java.util.*;

public class q14 {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        deque.offerLast(0);    //adding at last
        deque.offerFirst(1);   //adding at first
        deque.offerFirst(2);   //adding at first
        deque.offerFirst(3);   //adding at first
        deque.offerFirst(4);   //adding at first
        System.out.println(deque);


        deque.pollFirst();     //deleting from first
        deque.pollLast();      //deleting from last
        System.out.println(deque);
    }
}
