public class Demo {

  public static void main(String[] args) {
    Point p1 = new Point(3,4,0);
    ColouredPoint p2 = new ColouredPoint(3,4,0,'r');
    ColouredPoint p3 = new ColouredPoint(3,4,0,'b');
    System.out.println(p2.equals(p3));
    System.out.println(p1.equals(p3));
    System.out.println(p3.equals(p1));
  }

}
