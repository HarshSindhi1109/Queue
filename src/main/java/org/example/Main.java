package org.example;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(7);
        System.out.println(queue.poll());
        try {
//            queue.offer(1);
//            queue.offer(2);
//            queue.offer(3);
//            queue.offer(4);
//            queue.offer(5);
//            queue.offer(6);
//            queue.offer(7);
//            queue.remove();
//            queue.offer(0);
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(5);
            queue.offer(6);
            queue.offer(7);
            queue.remove();
            queue.offer(0);
            System.out.println(queue.offer(1));

            /* *
               * Major difference between .add() and .offer() is,
               * in .add(), if the queue is full, it will throw exception.
               * while in .offer(), if the queue is full, it will give message in form of false
               * and if not, it will give true.
               *
               * Similar to that,
               * .remove() will throw exception if queue is empty.
               * while .poll() will give message if queue is empty.
            */
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println(queue.peek());
        System.out.println(queue);

        NewDequeue newDequeue = new NewDequeue();
        newDequeue.dequeue();
    }
}