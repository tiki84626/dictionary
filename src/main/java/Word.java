import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mWord;
  private Definition mDef;
  private Integer mId;
  private static List<Word> mDictionary = new ArrayList<Word>();
  private static Definition definitionTest = new Definition(
    "the means by which the presence, quality, or genuineness of anything is" +
    " determined; a means of trial.",
    "the trial of the quality of something.",
    "a particular process or method for trying or assessing.",
    "a set of questions, problems, or the like, used as a means of evaluating" +
    " the abilities, aptitudes, skills, or performance of an individual or group;" +
    " examination."
    );


  public Word(String _word, Definition _definition) {
    mWord = _word;
    mDef = _definition;
    mDictionary.add(this);
    mId = mDictionary.size();
  }

  public static void main(String[] args) {
    Word test = new Word("test", definitionTest);
  }

  public String getWord() {
    return mWord;
  }

  public Definition getDefinition() {
    return mDef;
  }

  public static List<Word> all() {
    return mDictionary;
  }

  public static void clear() {
    mDictionary.clear();
  }

  public Integer getId() {
    return mId;
  }

  public static Word find(int id) {
    return mDictionary.get(id - 1);
  }





}
