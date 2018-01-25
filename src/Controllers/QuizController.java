package Controllers;

import View.Home;
import View.Login;
import View.Quiz;

public class QuizController {

    public static int questionCounter;

    public static int score;


    public static void submitAnswer(boolean correct) {

        if (correct) {
            System.out.println("Well done :)");
            score++;
        }
        else {
            System.out.println("Well darn :(");
        }

        if ( QuizController.questionCounter == 2 ) {

            System.out.println("You scored " + score + " out of " + questionCounter);
            Login.primaryStage.setScene(Home.generateScene());

        }
        else {

            QuizController.questionCounter++;

            if (QuizSelectController.currentQuestions.isEmpty()) {
                System.out.println("OH NO, THE QUESTION STACK IS EMPTY!");
                System.exit(-999);
            }

            Quiz.generateScene();
        }

    }

}
