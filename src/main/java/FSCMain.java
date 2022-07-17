import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class FSCMain {
  public static void main(String[] args) {
    HashMap<HomeAwayTeams, MatchInfo> scoreCard = new HashMap<>();
    //Collection<MatchInfo> matchInfoCollection = new ArrayList<>();
    // initial input
    Scanner status = new Scanner(System.in);
    while (status.hasNext()) {
      // System.out.println(status.next());
      String val = status.next();
      if (val.equals(String.valueOf(GameStatus.state.FINISH))) {
        System.out.println("3");
        FinishGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.START))) {
        StartGame.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.UPDATE))) {
        UpdateScore.main(scoreCard);
        status.nextLine();
      } else if (val.equals(String.valueOf(GameStatus.state.SUMMARY))) {


      }
    }





  }

}
