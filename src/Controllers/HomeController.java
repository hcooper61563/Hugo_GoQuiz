package Controllers;

import View.Login;
import View.Quizes;
import View.Scores;

public class HomeController {

    public static void moveToQuizes(){
        Login.primaryStage.setScene(Quizes.generateScene());
    }

    public static void moveToScores(){
        Login.primaryStage.setScene(Scores.generateScene());

    }
}
