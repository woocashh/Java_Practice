public class IntegerParser implements NumberParser<Integer> {

  public IntegerParser(){

  }

  @Override
  public Integer parseNumber(String s) {
    return Integer.valueOf(s);
  }

  @Override
  public String typeParsed() {
    return "int";
  }


}
