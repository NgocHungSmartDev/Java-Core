import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapLab {
  static Map<String, String> dashboard = new ConcurrentHashMap<>();

  public static void main(String[] args) {
    Runnable userA = () -> dashboard.put("taskA", "In Progress by User A");
    Runnable userB = () -> dashboard.put("taskB", "Done by User B");
    Runnable userC = () -> dashboard.put("taskC", "To Do by User C");

    Thread t1 = new Thread(userA);
    Thread t2 = new Thread(userB);
    Thread t3 = new Thread(userC);

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    dashboard.forEach((task, status) -> System.out.println(task + ": " + status));
  }
}
