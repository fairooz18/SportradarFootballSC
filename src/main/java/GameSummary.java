import java.util.*;

public class GameSummary {
  public static void main(HashMap<HomeAwayTeams, MatchInfo> scoreCard) {
    System.out.println("Games going on now are: ");
    final List<MatchInfo> sortedMatches = new ArrayList<>(scoreCard.values());
    Collections.sort(sortedMatches);
    for (MatchInfo matchInfo : sortedMatches) {
      System.out.println(matchInfo.toString());
    }
  }
}
