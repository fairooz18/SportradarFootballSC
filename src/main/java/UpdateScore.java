import java.util.*;

public class UpdateScore {
  public static void main(HashMap<String, MatchInfo> scoreCard) {
    // take the team names combo and use it to find in the Match Info and update the score
    // reading in the teams name to start the game
    Scanner readGameNumber = new Scanner(System.in);
    final List <String> keys = new ArrayList<>(scoreCard.keySet());
    if (keys.size()==0) {
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
      System.out.println("Number you entered is not an Integer.Try again. ");
      return;
    }
    if (match >= keys.size() || match < 0) {
      System.out.println("Index does not match. Please try again.");
      return;
    }
    System.out.println(
        "Enter home score and away score. Press ENTER after each.");
    int homeScore = Integer.parseInt(readGameNumber.next());
    int awayScore = Integer.parseInt(readGameNumber.next());
    MatchInfo updateInfo = scoreCard.get(keys.get(match));
    updateInfo.setHomeScore(homeScore);
    updateInfo.setAwayScore(awayScore);
    System.out.println("Score updated.");
    System.out.println(updateInfo.getHomeTeam() + "-" + updateInfo.getAwayTeam() + ":"
        + updateInfo.getHomeScore() + "-" + updateInfo.getAwayScore());

  }
}
