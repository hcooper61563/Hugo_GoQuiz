
package Controllers;

import Model.Question;
import Model.QuestionService;
import Model.Quiz;
import View.Login;

import java.util.ArrayList;

public class QuizSelectController {

    public static void buildQuiz(int quizID) {

        System.out.println("You made it this far: Quiz ID " + quizID);//shows which quiz has been seleced

        ArrayList<Question> allQuestions = new ArrayList<>();
        QuestionService.selectAll(allQuestions, Login.database);


        for (Question q : allQuestions) {
            if (q.getQuizID() == (quizID)) {
                Login.primaryStage.setScene(View.Quiz.generateScene(q.getQuestions(), q.getCorrectAnswer()));


            }
        }

    }
}
