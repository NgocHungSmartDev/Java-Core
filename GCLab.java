public class GCLab {
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("finalize object");
  }

  public static void main(String[] args) {
    GCLab gcLab1 = new GCLab();
    GCLab gcLab2 = new GCLab();
    gcLab1 = null;
    System.gc();
  }
}
