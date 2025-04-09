import java.util.Vector;

public class VectorLab {
  static Vector<String> results = new Vector<>();

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(() -> search("Java"));
    Thread t2 = new Thread(() -> search("Spring Boot"));

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    for (String r : results) {
      System.out.println("result: " + r);
    }
  }

  static void search(String keyword) {
    for (int i = 1; i <= 3; i++) {
      results.add("result " + i + " for keyword '" + keyword + "'");
    }
  }
}
