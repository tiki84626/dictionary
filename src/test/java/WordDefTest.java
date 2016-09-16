import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class WordDefTest {

  @Test
  public void Definition_InstantiatesCorrectly_true() {
    Definition newDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    assertEquals(true, newDefinition instanceof Definition);
  }

  @Test
  public void Word_InstantiatesCorrectly_true() {
    Word newWord = new Word("testWord");
    assertEquals(true, newWord instanceof Word);
  }


}
