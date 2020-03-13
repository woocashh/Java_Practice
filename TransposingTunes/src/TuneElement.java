public abstract class TuneElement {

  protected NoteValue duration;

  public TuneElement(NoteValue duration){
    this.duration = duration;
  }

  public NoteValue getValue() {
    return duration;
  }
}
