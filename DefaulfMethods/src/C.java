import java.io.IOException;

public class C implements K {

  @Override
  public void baz() {

  }

  @Override
  public int foo() {
    return 0;
  }

  @Override
  public int foo(int x) {
    return 0;
  }

  @Override
  public int bar(int y) {
    return 0;
  }

  // Needed to change the name cause in the original it does not throw an exception
  public int foobarOriginal() throws IOException {
    return 0;
  }

  // Access clashes so has to chane the name
  protected int foobarOriginal(int x){
    return 1;
  }

}
