public interface K extends J, I {

  void baz();

  default int foobar(int x) {
    return I.super.foobar(x);
  }

}
