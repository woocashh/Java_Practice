public class Dictionary extends Book {

  private String sourceLanguage;
  private String targetLanguage;
  int NumDefinitions;

  public Dictionary(String isbn, String title, int pages,
      String sourceLanguage, String targetLanguage, int NumDefinitions) {
    super(isbn, title, pages);
    this.sourceLanguage = sourceLanguage;
    this.targetLanguage = targetLanguage;
    this.NumDefinitions = NumDefinitions;
  }

  @Override
  public String toString() {
    return "Dictionary{" + super.toString() +
        "sourceLanguage='" + sourceLanguage + '\'' +
        ", targetLanguage='" + targetLanguage + '\'' +
        ", NumDefinitions=" + NumDefinitions +
        '}';
  }

}
