import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FinishGame {
  public static void run(HashMap<String, MatchInfo> scoreCard) {
    Scanner readGameNumber = new Scanner(System.in);
    List<String> keys = new ArrayList<>(scoreCard.keySet());
    if (keys.isEmpty()) {
      System.out.println("No games going on now. ");
      return;
    }
    System.out.println(
        "Number of games going on now are: " + keys.size());
    for (int i = 0; i < keys.size(); i++) {
      System.out.println("Press " + i + " to finish " + keys.get(i));
    }

    int finish;
    try {
      finish = readGameNumber.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Number you entered is not an Integer. Returning to main menu. ");
      return;
    }
    if (finish >= keys.size() || finish < 0) {
      System.out.println("Index does not match. Returning to main menu.");
      return;
    }
    System.out.println(
        "Game "+ keys.get(finish) + " is now finished.");
    scoreCard.remove(keys.get(finish));
    System.out.println(
        "Number of games still going on now are: " + scoreCard.size());
    for (String teams: scoreCard.keySet()) {
      System.out.println(teams);
    }
  }
}
