import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FinishGame {
  public static void main(HashMap<HomeAwayTeams, MatchInfo> scoreCard) {
    Scanner readGameNumber = new Scanner(System.in);
    List<HomeAwayTeams> keys = new ArrayList<>(scoreCard.keySet());
    System.out.println(
        "Games going on now are: " + keys.size());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println("Press " + i + " to finish " + keys.get(i).toString());
    }

    int finish = Integer.parseInt(readGameNumber.next());
    System.out.println(
        "Game "+ keys.get(finish) + "is now finished.");
    scoreCard.remove(keys.get(finish));
    System.out.println(
        "Games still going on now are: " + scoreCard.size());
    for (HomeAwayTeams teams: scoreCard.keySet()) {
      System.out.println(teams.toString());
    }

  }
}
