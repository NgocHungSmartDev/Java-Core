public class StringPoolLab {
  public static void main(String[] args) {
    String str1 = "Hello"; // Stored in string pool
    String str2 = "Hello"; // Reuses the string from pool
    String str3 = new String("Hello"); // New object in heap, not from pool

    System.out.println("str1 == str2: " + (str1 == str2)); // true - same reference from string pool
    System.out.println("str1 == str3: " + (str1 == str3)); // false - different references
    System.out.println("str1.equals(str3): " + str1.equals(str3)); // true - same content

    // Use intern() to move str3 to string pool
    String str4 = str3.intern(); // Returns reference from the string pool
    System.out.println("str1 == str4: " + (str1 == str4)); // true - both point to pool string
  }
}
