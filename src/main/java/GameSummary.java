import java.util.*;

public class GameSummary {
  public static void main(HashMap<String, MatchInfo> scoreCard) {
    if (scoreCard.keySet().size()==0) {
      System.out.println("No games going on now.");
      return;
    }
    System.out.println("Games going on now are: ");
    final List<MatchInfo> sortedMatches = new ArrayList<>(scoreCard.values());
    Collections.sort(sortedMatches);
    sortedMatches.stream()
        .map(MatchInfo::toString)
        .forEach(System.out::println);
  }
}
