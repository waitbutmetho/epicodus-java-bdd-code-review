import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {}

    public static String stringToWordPuzzle(String userString) {
  String wordPuzzleString = userString.replaceAll("[aeiouAEIOU]", "-");
  return wordPuzzleString;
  }
}
