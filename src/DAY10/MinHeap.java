package DAY10;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);

        System.out.println("SMmallest : " + minHeap.peek());
    }
}
