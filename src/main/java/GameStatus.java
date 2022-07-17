import java.util.Collection;
import java.util.HashMap;

public class GameStatus {

  public enum state {
    START,
    FINISH,
    UPDATE,
    SUMMARY
  }

  public HashMap<HomeAwayTeams, MatchInfo> summaryScoreCard(MatchInfo matchInfo,
                                                            HashMap<HomeAwayTeams, MatchInfo> scoreCard) {
    HomeAwayTeams teams = new HomeAwayTeams(matchInfo.getHomeTeam(), matchInfo.getAwayTeam());
    // store inputs in a map.
    scoreCard.put(teams, matchInfo);
    return scoreCard;
  }
}
