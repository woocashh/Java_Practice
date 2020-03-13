import java.util.Iterator;

public class TransposedTune extends AbstractTune {
  private Tune toBeTransposed;
  private int intervalOfTransposition;

  TransposedTune(Tune toBeTransposed, int intervalOfTransposition) {
    this.toBeTransposed = toBeTransposed;
    this.intervalOfTransposition = intervalOfTransposition;
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    if (tuneElement instanceof Note) {
      toBeTransposed.addTuneElement(
          noteFromAbsolutePitch(
              noteToAbsolutePitch(
                  (Note) tuneElement) - intervalOfTransposition,
              tuneElement.getValue()
          )
      );
    } else {
      toBeTransposed.addTuneElement(tuneElement);
    }
  }

  // Uses the octave and note name components of a note to turn the
// note into an absolute pitch value
  private static int noteToAbsolutePitch(Note note){
    return note.getName().ordinal() + NoteName.values().length * note.getOctave();
  }

  // From an absolute pitch value, works out the corresponding octave
// and note name, and returns a Note comprised of these and the given
// note value
  private static Note noteFromAbsolutePitch(int pitch, NoteValue value){
    NoteName newNoteName = NoteName.values()[pitch % NoteName.values().length];
    int newOctave = pitch / NoteName.values().length;

    return new Note(newNoteName, newOctave, value);
  }

  @Override
  public Iterator<TuneElement> iterator() {
    return new TransposedTuneIterator();
  }

  private class TransposedTuneIterator implements Iterator<TuneElement>{
    private Iterator<TuneElement> originalTuneIterator;

    private TransposedTuneIterator(){
      originalTuneIterator = toBeTransposed.iterator();
    }
    @Override
    public boolean hasNext() {
      return originalTuneIterator.hasNext();
    }

    @Override
    public TuneElement next() {

      TuneElement originalTuneNext = originalTuneIterator.next();

      if (originalTuneNext instanceof Rest) {
        return originalTuneNext;
      }

      return noteFromAbsolutePitch(noteToAbsolutePitch((Note) originalTuneNext)
              + intervalOfTransposition, originalTuneNext.getValue());
    }

    @Override
    public void remove() {
      originalTuneIterator.remove();

    }
  }
}
