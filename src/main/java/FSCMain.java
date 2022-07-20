import java.util.HashMap;
import java.util.Scanner;

public class FSCMain {
  public static void main(String[] args) {
    HashMap<String, MatchInfo> scoreCard = new HashMap<>();
    // initial input
    Scanner status = new Scanner(System.in);
    while (status.hasNext()) {
      String val = status.next();
      if (val.equals(String.valueOf(GameStatus.FINISH))) {
        FinishGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.START))) {
        StartGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.UPDATE))) {
        UpdateScore.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.SUMMARY))) {
        GameSummary.main(scoreCard);
        status.nextLine();
      } else {
        System.out.println("No keyword match. Try one of these \n START \n FINISH\n UPDATE \n SUMMARY");
      }
    }





  }

}
