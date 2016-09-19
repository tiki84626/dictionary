import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class WordDefTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void word_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Word testWord = new Word("testWord", testDefinition);
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void newWord_savesDefinitionInformation_definition() {
    Definition testDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Word testWord = new Word("testWord", testDefinition);
    assertEquals(testDefinition, testWord.getDefinition());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Definition firstDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Definition secondDefinition = new Definition("1st Def", "2nd Def", "3rd Def", "4th Def");
    Word firstWord = new Word("firstWord", firstDefinition);
    Word secondWord = new Word("secondWord", secondDefinition);
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromArrayList_0() {
    Definition testDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Word testWord = new Word("testWord", testDefinition);
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnID_1() {
    Word.clear();
    Definition testDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Word testWord = new Word("testWord", testDefinition);
    assertEquals((Integer) 1, testWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Definition firstDefinition = new Definition("Fist Def", "Second Def", "Third Def", "Fourth Def");
    Definition secondDefinition = new Definition("1st Def", "2nd Def", "3rd Def", "4th Def");
    Word firstWord = new Word("firstWord", firstDefinition);
    Word secondWord = new Word("secondWord", secondDefinition);
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

}
