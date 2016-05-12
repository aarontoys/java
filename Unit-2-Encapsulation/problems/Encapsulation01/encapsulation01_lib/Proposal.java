package encapsulation01_lib;

public class Proposal {
  private String name = "";
  public int allInFavor = 0;
  public int allAgainst = 0;

  public String getName () {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }
}
