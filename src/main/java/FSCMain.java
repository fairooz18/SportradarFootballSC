import java.util.HashMap;
import java.util.Scanner;

public class FSCMain {
  public static void main(String[] args) {
    HashMap<String, MatchInfo> scoreCard = new HashMap<>();
    Scanner status = new Scanner(System.in);
    while (status.hasNext()) {
      String val = status.next();
      if (val.equals(String.valueOf(GameCommands.FINISH))) {
        FinishGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameCommands.START))) {
        StartGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameCommands.UPDATE))) {
        UpdateScore.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameCommands.SUMMARY))) {
        GameSummary.main(scoreCard);
        status.nextLine();
      } else {
        System.out.println("No keyword match. Try one of these \n START \n FINISH\n UPDATE \n SUMMARY");
      }
    }
  }

}
