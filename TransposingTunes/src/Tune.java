public interface Tune extends Iterable<TuneElement> {

  // Add an element to the tune
  void addTuneElement(TuneElement tuneElement);

  // Return a tune derived from the original, transposed up
// three semitones
  Tune transpose(int interval);


}
