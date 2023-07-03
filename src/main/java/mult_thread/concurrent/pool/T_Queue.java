package mult_thread.concurrent.pool;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class T_Queue {

    public static void main(String[] args) {
//        Queue<Integer> queue1 = new LinkedBlockingQueue<>();
        Queue<Integer> queue = new ArrayBlockingQueue(1);
        queue.offer(11);
        queue.offer(22);
//        queue.add(1);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
