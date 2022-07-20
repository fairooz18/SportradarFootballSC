import java.util.HashMap;
import java.util.Scanner;

public class StartGame {
  public static void run(HashMap<String, MatchInfo> hm) {
    Scanner readTeams = new Scanner(System.in);
    System.out.print("Enter home team: ");
    String homeTeam = readTeams.nextLine().toUpperCase().trim();
    System.out.print("Enter away team: ");
    String awayTeam = readTeams.nextLine().toUpperCase().trim();
    String homeAwayTeams = homeTeam.concat("-").concat(awayTeam);

    if (hm.containsKey(homeAwayTeams)) {
      System.out.println(
          "This game has already started at " + hm.get(homeAwayTeams).getMatchStartTime());
      return;
    }

    for (String hat : hm.keySet()) {
      if (hat.contains(homeTeam) || hat.contains(awayTeam)) {
        System.out.println(
            "One of these teams are already playing in match " + hat);
        return;
      }
    }
    hm.put(homeAwayTeams, new MatchInfo(homeTeam, awayTeam));
    System.out.println(
        "Match started.");
  }
}
