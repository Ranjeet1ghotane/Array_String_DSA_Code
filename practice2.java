import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        // Natural ordering (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        //System.out.println("PriorityQueue: " + pq);

        // Head element
        System.out.println("Peek: " + pq.peek()); // smallest element

        // Removing elements (poll in priority order)
        // while (!pq.isEmpty()) {
        //     System.out.println("removing: " + pq.remove());
        // }
        System.out.println("PriorityQueue: " + pq.contains(20));
        System.out.println("PriorityQueue: " + pq);


    }
}
