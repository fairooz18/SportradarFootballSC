import java.util.*;

public class StartGame {

  public static void main(HashMap<HomeAwayTeams, MatchInfo> hm) {
    GameStatus gameStatus = new GameStatus();

    // reading in the teams name to start the game
    Scanner readTeams = new Scanner(System.in);
    System.out.println(
        "Enter home team and away team shorts. Press ENTER after each.");
    // storing the teams in variables
    MatchInfo matchInfo = new MatchInfo();
    matchInfo.setHomeTeam(readTeams.next());
    matchInfo.setAwayTeam(readTeams.next());
    // initial scores are set as 0-0
    matchInfo.setHomeScore(0);
    matchInfo.setAwayScore(0);
    matchInfo.setMatchStartTime(new Date());
    // store the new started match in a hashmap
    gameStatus.summaryScoreCard(matchInfo, hm);
  }


}
