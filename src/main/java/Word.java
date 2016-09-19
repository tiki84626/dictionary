import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mWord;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private Integer mId;
  private static List<Definition> mDefinitions;



  public Word(String word) {
    mWord = word;
    instances.add(this);
    mId = instances.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getWord() {
    return mWord;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public Integer getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public static void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }




}
