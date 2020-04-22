public interface NumberParser<E> {

  public E parseNumber(String s);

  public String typeParsed();

}
