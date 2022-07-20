import java.util.Date;

public class MatchInfo implements Comparable<MatchInfo>{
  private final String homeTeam;
  private final String awayTeam;
  private int homeScore;
  private int awayScore;
  private final Date matchStartTime;

  public MatchInfo(String homeTeam, String awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.homeScore = 0;
    this.awayScore = 0;
    this.matchStartTime = new Date();
  }

  public String getHomeTeam() {
    return homeTeam;
  }

  public String getAwayTeam() {
    return awayTeam;
  }

  public int getHomeScore() {
    return homeScore;
  }

  public void setHomeScore(int score) {
    this.homeScore = score;
  }

  public int getAwayScore() {
    return awayScore;
  }

  public void setAwayScore(int score) {
    this.awayScore = score;
  }

  public Date getMatchStartTime() {
    return matchStartTime;
  }

  @Override
  public int compareTo(MatchInfo other) {
    int matchTotalScore = homeScore + awayScore;
    int otherTotalScore = other.getHomeScore() + other.getAwayScore();
    if (matchTotalScore > otherTotalScore) {
      return -1;
    } else if (matchTotalScore < otherTotalScore) {
      return 1;
    }
    return other.getMatchStartTime().compareTo(matchStartTime);
  }

  @Override
  public String toString() {
    return homeTeam + " " + homeScore +
        " - " + awayTeam + " " + awayScore;
  }
}
