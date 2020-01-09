public class client {

  public static void main(String[] args) {
    Dice dc = new Dice();
    dc.roll();
    int res = dc.getTop();

    System.out.println(res);
  }

}
