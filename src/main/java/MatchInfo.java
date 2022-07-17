import java.util.Date;

public class MatchInfo {
  public String homeTeam;
  public String awayTeam;
  public int homeScore;
  public int awayScore;
  public Date matchStartTime;

  public MatchInfo() {

  }
  /*public MatchInfo(String homeTeam, String awayTeam, int homeScore, int awayScore, Date matchStartTime) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.homeScore = homeScore;
    this.awayScore = awayScore;
    this.matchStartTime = matchStartTime;
  }*/

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
}
