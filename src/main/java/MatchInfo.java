import java.util.Date;

public class MatchInfo implements Comparable<MatchInfo>{
  private String homeTeam;
  private String awayTeam;
  private int homeScore;
  private int awayScore;
  private Date matchStartTime;

  public MatchInfo() {
  }

  public String getHomeTeam() {
    return homeTeam;
  }
  public void setHomeTeam(String name) {
    this.homeTeam = name;
  }

  public String getAwayTeam() {
    return awayTeam;
  }
  public void setAwayTeam(String name) {
    this.awayTeam = name;
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
  public void setMatchStartTime(Date date) {
    this.matchStartTime = date;
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
