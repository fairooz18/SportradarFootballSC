import java.util.*;

public class StartGame {

  public static void main(HashMap<String, MatchInfo> hm) {
    Scanner readTeams = new Scanner(System.in);
    System.out.println(
        "Enter home team and away team shorts. Press ENTER after each.");
    String homeTeam = readTeams.next().toUpperCase();
    String awayTeam = readTeams.next().toUpperCase();
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
