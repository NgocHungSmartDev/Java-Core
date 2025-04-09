import java.util.LinkedList;
import java.util.Queue;

public class LinkedListLab {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

    queue.add("Customer A");
    queue.add("Customer B");
    queue.add("Customer C");

    while (!queue.isEmpty()) {
      String customer = queue.poll();
      System.out.println("processing: " + customer);
    }
  }
}
