public enum NoteValue {
  WHOLE("(1/1)"),
  HALF("(1/2)"),
  QUARTER("(1/4)"),
  EIGHTH("(1/8)"),
  SIXTEENTH("(1/16)");
  private String num;
  private NoteValue(String num){
    this.num = num;
  }

  @Override
  public String toString() {
    return num.toString();
  }
}
