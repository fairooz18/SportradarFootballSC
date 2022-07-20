import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GameSummary {
  public static void run(HashMap<String, MatchInfo> scoreCard) {
    if (scoreCard.keySet().isEmpty()) {
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
