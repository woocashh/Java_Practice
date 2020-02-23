import java.util.Map;
import java.util.Objects;

public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getZ() {
    return z;
  }


  public double distance(Point other){
    return Math.sqrt(Math.pow(x - other.getX(), 2)
        + Math.pow(y - other.getY(), 2)
        + Math.pow(z - other.getZ(), 2));
  }

  public Point getOrigin(){
    return new Point(0,0,0);
  }

  public double getMagnitude(){
    return distance(getOrigin());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Point)) {
      return false;
    }
    Point point = (Point) o;
    return Double.compare(point.getX(), getX()) == 0 &&
        Double.compare(point.getY(), getY()) == 0 &&
        Double.compare(point.getZ(), getZ()) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getX(), getY(), getZ());
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }
}
