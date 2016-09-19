public class Definition {
  private String mDef1;
  private String mDef2;
  private String mDef3;
  private String mDef4;

  public Definition(String _def1, String _def2, String _def3, String _def4) {
    mDef1 = _def1;
    mDef2 = _def2;
    mDef3 = _def3;
    mDef4 = _def4;
  }

  public static void main(String[] args) {
    Definition test = new Definition(
      "the means by which the presence, quality, or genuineness of anything is" +
      " determined; a means of trial.",
      "the trial of the quality of something.",
      "a particular process or method for trying or assessing.",
      "a set of questions, problems, or the like, used as a means of evaluating" +
      " the abilities, aptitudes, skills, or performance of an individual or group;" +
      " examination."
      );

    Definition joke = new Definition(
      "something said or done to provoke laughter or cause amusement, as a witticism," +
      " a short and amusing anecdote, or a prankish act.",
      "something that is amusing or ridiculous, especially because of being ludicrously" +
      " inadequate or a sham; a thing, situation, or person laughed at rather than taken" +
      " seriously; farce.",
      "a matter that need not be taken very seriously; trifling matter.",
      "something that does not present the expected challenge; something very easy."
      );
  }

  public String getDef1() {
    return mDef1;
  }

  public String getDef2() {
    return mDef2;
  }

  public String getDef3() {
    return mDef3;
  }

  public String getDef4() {
    return mDef4;
  }




}
