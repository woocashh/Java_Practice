import java.util.Iterator;

public class Rest extends TuneElement{
  public Rest(NoteValue duration){
    super(duration);
  }

  @Override
  public String toString() {
    return "Rest" + duration;
  }

}
