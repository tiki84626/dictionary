import org.junit.*;
import static org.junit.Assert.*;

public class WordDefinitionTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("test");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getWord_instantiatesWithProperWord_test() {
    Word testWord = new Word("test");
    assertEquals("test", testWord.getWord());
  }

  @Test
  public void definition_instantiatesWithDefinition_String() {
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    assertEquals("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.", testDefinition.getDefinition());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("test");
    Word secondWord = new Word("joke");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    Definition jokeDefinition = new Definition("a thing that someone says to cause amusement or laughter, especially a story with a funny punchline.");
    assertEquals(true, Definition.all().contains(testDefinition));
    assertEquals(true, Definition.all().contains(jokeDefinition));
  }

  @Test
  public void clear_emptiesAllWordsFromList_0() {
    Word testWord = new Word("test");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList_0() {
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

  @Test
  public void getId_wordsInstantiateWithAnId_1() {
    Word.clear();
    Word testWord = new Word("test");
    assertEquals((Integer) 1, testWord.getId());
  }

  @Test
  public void getId_definitionsInstantiateWithAnId_1() {
    Definition.clear();
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    assertEquals((Integer) 1, testDefinition.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word.clear();
    Word firstWord = new Word("test");
    Word secondWord = new Word("joke");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void addDefinition_addsDefinitionToDictionary_true() {
    Word testWord = new Word("test");
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition testDefinition = new Definition("a procedure intended to establish the quality, performance, or reliability of something, especially before it is taken into widespread use.");
    Definition jokeDefinition = new Definition("a thing that someone says to cause amusement or laughter, especially a story with a funny punchline.");
    assertEquals(Definition.find(jokeDefinition.getId()), jokeDefinition);
  }

}
