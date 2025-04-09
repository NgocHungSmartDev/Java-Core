import java.util.*;

public class SetLab {
  public static void main(String[] args) {
    Set<String> emails = new HashSet<>();

    emails.add("hung@gmail.com");
    emails.add("lan@yahoo.com");
    emails.add("hung2@gmail.com");

    for (String email : emails) {
      System.out.println("email send: " + email);
    }

    // LinkedHashSet same to set. However, linkedHashSet keep insertion Order
    Set<String> lhs = new LinkedHashSet<>();
    lhs.add("Banana");
    lhs.add("Apple");
    lhs.add("Orange");
    lhs.add("Banana");

    System.out.println(lhs);

    // TreeSet has order
    Set<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("C");
    linkedHashSet.add("A");
    linkedHashSet.add("B");

    Set<String> sortedSet = new TreeSet<>((a, b) -> b.compareTo(a));
    sortedSet.addAll(linkedHashSet);

    System.out.println(sortedSet);
  }
}
