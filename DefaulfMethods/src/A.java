public class A implements I {

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

  public int foobar(){
    return 0;
  }

  // This clashes with the default method in I, so the name has to be changed
  public void foobarOriginal(int x){
    return;
  }

}
