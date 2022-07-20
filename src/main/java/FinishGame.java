import java.util.*;

public class FinishGame {
  public static void main(HashMap<String, MatchInfo> scoreCard) {
    Scanner readGameNumber = new Scanner(System.in);
    List<String> keys = new ArrayList<>(scoreCard.keySet());
    if (keys.size()==0) {
      System.out.println("No games going on now.");
      return;
    }
    System.out.println(
        "Games going on now are: " + keys.size());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println("Press " + i + " to finish " + keys.get(i));
    }

    int finish = Integer.parseInt(readGameNumber.next());
    System.out.println(
        "Game "+ keys.get(finish) + "is now finished.");
    scoreCard.remove(keys.get(finish));
    System.out.println(
        "Games still going on now are: " + scoreCard.size());
    for (String teams: scoreCard.keySet()) {
      System.out.println(teams);
    }

  }
}
