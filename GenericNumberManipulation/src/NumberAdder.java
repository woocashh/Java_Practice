public interface NumberAdder<T> {

  // Return a number of type T that represents zero
  T zero();

  // Return the sum of x and y
  public T add(T x, T y);
}
