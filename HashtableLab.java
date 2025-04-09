import java.util.Hashtable;
import java.util.Map;

public class HashtableLab {
  static Map<String, String> sharedSheet = new Hashtable<>();

  public static void main(String[] args) {
    Runnable userA = () -> sharedSheet.put("RowA", "Edited by User A");
    Runnable userB = () -> sharedSheet.put("RowB", "Edited by User B");
    Runnable userC = () -> sharedSheet.put("RowC", "Edited by User C");

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

    sharedSheet.forEach((row, edit) -> System.out.println(row + ": " + edit));
  }
}
