import java.util.Objects;

public class ColouredPoint extends Point {

  private char colour;
  public ColouredPoint(double x, double y, double z, char colour) {
    super(x, y, z);
    this.colour = colour;
  }

  @Override
  public String toString() {
    return super.toString() + " " + colour ;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if(o instanceof Point && !(o instanceof ColouredPoint)){
      return super.equals(o);
    }
    if (!(o instanceof ColouredPoint)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ColouredPoint that = (ColouredPoint) o;
    return colour == that.colour;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), colour);
  }
}
