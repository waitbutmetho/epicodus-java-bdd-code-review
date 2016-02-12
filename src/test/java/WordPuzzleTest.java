import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordPuzzleTest {
  @Test
  public void stringToWordPuzzle_Replace_a_WithDash_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l", testWordPuzzle.stringToWordPuzzle("lal"));
  }
  @Test
  public void stringToWordPuzzle_Replace_ae_WithDashes_4() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("l-l-l", testWordPuzzle.stringToWordPuzzle("lalel"));
  }
}
