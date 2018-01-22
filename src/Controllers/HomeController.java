package Controllers;

import View.Login;
import View.QuizSelect;
import View.Scores;

public class HomeController {

    public static void moveToQuizes(){
        Login.primaryStage.setScene(QuizSelect.generateScene());
    }

    public static void moveToScores(){
        Login.primaryStage.setScene(Scores.generateScene());

    }
}
