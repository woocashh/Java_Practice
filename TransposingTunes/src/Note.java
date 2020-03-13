import java.util.Iterator;

public class Note extends TuneElement{

  private final NoteName name;
  private final int octave;

  public Note(NoteName name, int octave, NoteValue duration){
    super(duration);
    this.name = name;
    this.octave = octave;
  }

  public NoteName getName() {
    return name;
  }

  public int getOctave(){
    return octave;
  }

  @Override
  public String toString() {
    return name.name() + octave + duration;
  }

}
