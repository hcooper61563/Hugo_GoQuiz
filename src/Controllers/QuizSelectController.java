
package Controllers;

import Model.Question;
import Model.QuestionService;
import View.Login;
import View.Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class QuizSelectController {

    public static Stack<Question> currentQuestions;

    public static int currentQuiz;//creates variable for current quizID
    public static void buildQuiz(int quizID) {

        currentQuiz=quizID;
        currentQuestions = new Stack<>();

        System.out.println("You made it this far: Quiz ID " + quizID);//shows which quiz has been seleced

        Stack<Question> allQuestions = new Stack<>();
        QuestionService.selectAll(allQuestions, Login.database);

        for (Question q : allQuestions) {
            if (q.getQuizID() == (quizID)) {
                currentQuestions.push(q);
            }
        }

        Collections.shuffle(currentQuestions);

        QuizController.questionCounter = 1;
        QuizController.score = 0;

        View.Quiz.generateScene();

    }
}
