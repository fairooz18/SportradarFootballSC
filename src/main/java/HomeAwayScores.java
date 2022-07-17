public class HomeAwayScores {
  private final int homeScore;
  private final int awayScore;

  public HomeAwayScores(int homeScore, int awayScore){
    this.homeScore = homeScore;
    this.awayScore = awayScore;
  }

  @Override
  public int hashCode(){
    return homeScore ^ awayScore;
  }

  @Override
  public boolean equals(Object other){
    return other instanceof HomeAwayScores
        && ((HomeAwayScores)other).homeScore==homeScore
        && ((HomeAwayScores)other).awayScore==awayScore;
  }
}
