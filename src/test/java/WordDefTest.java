import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class WordDefTest {

  @Test
  public void Word_InstantiatesCorrectly_true() {
    Definition newDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    assertEquals(false, newDefinition instanceof Definition);
  }


}
