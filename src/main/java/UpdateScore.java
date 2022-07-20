import java.util.*;

public class UpdateScore {
  public static void run(HashMap<String, MatchInfo> scoreCard) {
    Scanner readGameNumber = new Scanner(System.in);
    final List <String> keys = new ArrayList<>(scoreCard.keySet());
    if (keys.isEmpty()) {
      System.out.println("No games going on now to update.");
      return;
    }
    System.out.println(
        "Games going on now are: " + keys.size());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println("Press " + i + " for " + keys.get(i));
    }

    int match;
    try {
      match = Integer.parseInt(readGameNumber.next());
    } catch (NumberFormatException e) {
      System.out.println("Number you entered is not an Integer. Returning to main menu. ");
      readGameNumber.close();
      return;
    }
    if (match >= keys.size() || match < 0) {
      System.out.println("Index does not match. Returning to main menu.");
      readGameNumber.close();
      return;
    }
    System.out.println(
        "Enter home score and away score. Press ENTER after each.");
    int homeScore = Integer.parseInt(readGameNumber.next());
    int awayScore = Integer.parseInt(readGameNumber.next());
    readGameNumber.close();
    MatchInfo updateInfo = scoreCard.get(keys.get(match));
    updateInfo.setHomeScore(homeScore);
    updateInfo.setAwayScore(awayScore);
    System.out.println("Score updated.");
    System.out.println(updateInfo.getHomeTeam() + "-" + updateInfo.getAwayTeam() + ":"
        + updateInfo.getHomeScore() + "-" + updateInfo.getAwayScore());

  }
}
