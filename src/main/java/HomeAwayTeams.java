public final class HomeAwayTeams {

  private final String homeName;
  private final String awayName;

  public HomeAwayTeams(String homeName, String awayName){
    assert homeName != null;
    assert awayName != null;
    this.homeName = homeName;
    this.awayName = awayName;
  }

  @Override
  public int hashCode(){
    return homeName.hashCode() ^ awayName.hashCode();
  }

  @Override
  public boolean equals(Object other){
    return other instanceof HomeAwayTeams
        && ((HomeAwayTeams)other).homeName.equals(homeName)
        && ((HomeAwayTeams)other).awayName.equals(awayName);
  }

  @Override
  public String toString() {
    return homeName + "-" + awayName;
  }
}
