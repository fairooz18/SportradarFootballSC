import java.util.HashMap;
import java.util.Scanner;

public class FSCMain {
  public static void main(String[] args) {
    HashMap<String, MatchInfo> scoreCard = new HashMap<>();
    System.out.print("Scorecard has been started... Enter a command: ");
    Scanner status = new Scanner(System.in);
    while (status.hasNext()) {
      String val = status.nextLine();
      if (val.equals(String.valueOf(GameCommands.FINISH))) {
        FinishGame.run(scoreCard);
      } else if (val.equals(String.valueOf(GameCommands.START))) {
        StartGame.run(scoreCard);
      } else if (val.equals(String.valueOf(GameCommands.UPDATE))) {
        UpdateScore.run(scoreCard);
      } else if (val.equals(String.valueOf(GameCommands.SUMMARY))) {
        GameSummary.run(scoreCard);
      } else {
        System.out.println("No keyword match. Try one of these \n START \n FINISH\n UPDATE \n SUMMARY");
      }
    }
  }

}
