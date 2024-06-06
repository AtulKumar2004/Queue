import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addLast(3); // 2 1 3
        deque.addLast(4); // 2 1 3 4
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque); // 2 1 3
        
        System.out.println("first element = "+ deque.getFirst());
        System.out.println("last element = "+ deque.getLast());

    }
}
