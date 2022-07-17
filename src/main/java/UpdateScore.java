import java.util.*;

public class UpdateScore {
  public static void main(HashMap<HomeAwayTeams, MatchInfo> scoreCard) {
    // take the team names combo and use it to find in the Match Info and update the score
    // reading in the teams name to start the game
    Scanner readGameNumber = new Scanner(System.in);
    final List <HomeAwayTeams> keys = new ArrayList<>(scoreCard.keySet());
    System.out.println(
        "Games going on now are: " + keys.size());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println("Press " + i + " for " + keys.get(i).toString());
    }

    int match = Integer.parseInt(readGameNumber.next());
    System.out.println(
        "Enter home score and away score. Press ENTER after each.");
    int homeScore = Integer.parseInt(readGameNumber.next());
    int awayScore = Integer.parseInt(readGameNumber.next());
    MatchInfo updateInfo = scoreCard.get(keys.get(match));
    updateInfo.setHomeScore(homeScore);
    updateInfo.setAwayScore(awayScore);
    System.out.println("Score updated.");
    System.out.println(updateInfo.homeTeam + "-" + updateInfo.awayTeam + ":"
        + updateInfo.homeScore + "-" + updateInfo.awayScore);

  }
}
