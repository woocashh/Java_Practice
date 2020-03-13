public class ImmutablePair<S,T> {
  private final S fst;
  private final T scd;

  public ImmutablePair(S fst, T scd){
    this.fst = fst;
    this.scd = scd;
  }

  public S getFst() {
    return fst;
  }

  public T getScd() {
    return scd;
  }

  @Override
  public String toString() {
    return "(" + fst +
        ", " + scd +
        ')';
  }
}