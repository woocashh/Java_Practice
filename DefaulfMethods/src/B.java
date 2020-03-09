public class B implements I,J {

  @Override
  public int foo() {
    return 0;
  }

  @Override
  public int foo(int x) {
    return 0;
  }

  @Override
  public int bar(int x) {
    return 0;
  }

  // I, J required the follwoing method, so the ambiguity has to be resolved
  @Override
  public int foobar(int x) {
    return I.super.foobar(x);
  }
}
