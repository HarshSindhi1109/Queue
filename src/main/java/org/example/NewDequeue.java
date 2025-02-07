package org.example;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class NewDequeue {
    public void dequeue() {
        Deque<Integer> deque = new LinkedBlockingDeque<>();

        deque.offer(101);
        deque.offer(102);
        deque.offer(103);
        deque.offer(104);
        deque.offer(105);
        deque.addFirst(100);
        deque.removeLast();

        System.out.println(deque);
    }
}
