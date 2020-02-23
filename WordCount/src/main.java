import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader =
        new BufferedReader(new InputStreamReader(new FileInputStream("WordCount/src/test")));
    String line = reader.readLine();
    int countWords = 0;
    int countLines = 0;
    int countChars = 0;
    while (line!=null) {

      countLines++;
      countWords += wordsInLine(line);
      countChars += charsInLine(line);
      line = reader.readLine();
    }
    System.out.println(countLines);
    System.out.println(countWords);
    System.out.println(countChars);
  }

  private static int wordsInLine(String line) {
    int result = 0;
    int word = 0;

    for (char c : line.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        word++;
      } else {
        if (word > 0) {
          result++;
          word = 0; //??
        }
      }
    }
    if (word > 0) {
      result++;
    }
    return result;
  }

  private static int charsInLine(String line) {
    int result = 0;
    for (char c : line.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        result++;
      }
    }
    return result;
  }
}
