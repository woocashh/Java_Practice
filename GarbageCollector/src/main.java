public class main {

  public static void main(String[] args) {
    for(int i = 0; i<1_000_000; i++){
      new A(i);
    }
    System.out.println("Number of instances of A garbage-collected: " + A.numCollected);

  }
}
