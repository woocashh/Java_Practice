public abstract class AbstractTune implements Tune {

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    for(TuneElement t : this) {
      res.append(t + ", ");
    }
    return res.toString();
  }

  public Tune transpose(int interval){
    return new TransposedTune(this,interval);
  }
}
