import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UpdateScore {
  public static void run(HashMap<String, MatchInfo> scoreCard) {
    Scanner readGameNumber = new Scanner(System.in);
    try {
      final List <String> keys = new ArrayList<>(scoreCard.keySet());
      if (keys.isEmpty()) {
        System.out.println("No games going on now to update.");
        return;
      }
      System.out.println(
          "Number of games going on now are: " + keys.size());
      for (int i = 0; i < keys.size(); i++) {
        System.out.println("Press " + i + " for " + keys.get(i));
      }

      int match = readGameNumber.nextInt();
      if (match >= keys.size() || match < 0) {
        System.out.println("Index does not match. Returning to main menu.");
        return;
      }
      System.out.print("Enter home score: ");
      int homeScore = readGameNumber.nextInt();
      System.out.print("Enter away score: ");
      int awayScore = readGameNumber.nextInt();
      MatchInfo updateInfo = scoreCard.get(keys.get(match));
      updateInfo.setHomeScore(homeScore);
      updateInfo.setAwayScore(awayScore);
      System.out.println("Score updated.");
      System.out.println(updateInfo.getHomeTeam() + "-" + updateInfo.getAwayTeam() + ":"
          + updateInfo.getHomeScore() + "-" + updateInfo.getAwayScore());
    } catch (InputMismatchException e) {
      System.out.println("Number you entered is not an Integer. Returning to main menu. ");
    }
  }
}
