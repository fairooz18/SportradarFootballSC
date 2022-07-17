import java.util.HashMap;
import java.util.Scanner;

public class FSCMain {
  public static void main(String[] args) {
    HashMap<HomeAwayTeams, MatchInfo> scoreCard = new HashMap<>();
    // initial input
    Scanner status = new Scanner(System.in);
    while (status.hasNext()) {
      String val = status.next();
      if (val.equals(String.valueOf(GameStatus.state.FINISH))) {
        FinishGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.START))) {
        StartGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.UPDATE))) {
        UpdateScore.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.SUMMARY))) {
        GameSummary.main(scoreCard);
        status.nextLine();
      }
    }





  }

}
