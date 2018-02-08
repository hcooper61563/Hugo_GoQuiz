

package View;

import Controllers.QuizController;
import Controllers.QuizSelectController;
import Model.Question;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    public static void generateScene() {

        System.out.println("Question number " + QuizController.questionCounter);




        GridPane grid = new GridPane();//Creating a grid pane to put my text fields and labels on
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid );

        Text scenetitle = new Text("GoQuiz");//Adding text that says 'GoQuiz' under the scenetitle variable
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Text question = new Text(q.getQuestions());//Adding text that says 'GoQuiz' under the scenetitle variable
        question.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(question, 0, 1, 2, 1);

        Button answer[] = new Button[4];

        ArrayList<Integer> columns = new ArrayList<>();
        columns.add(0);
        columns.add(1);
        columns.add(2);
        columns.add(3);
        Collections.shuffle(columns);

        answer[0] = new Button(q.getCorrectAnswer());
        answer[0].setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        grid.add(answer[0], columns.get(0), 2, 1, 1);
        answer[0].setOnAction(ae -> QuizController.submitAnswer(true));
        answer[0].setFocusTraversable(false);

        answer[1] = new Button(q.getWrongAnswer1());
        answer[1].setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        grid.add(answer[1], columns.get(1), 2, 1, 1);
        answer[1].setOnAction(ae -> QuizController.submitAnswer(false));
        answer[1].setFocusTraversable(false);

        answer[2] = new Button(q.getWrongAnswer2());
        answer[2].setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        grid.add(answer[2], columns.get(2), 2, 1, 1);
        answer[2].setOnAction(ae -> QuizController.submitAnswer(false));
        answer[2].setFocusTraversable(false);

        answer[3] = new Button(q.getWrongAnswer3());
        answer[3].setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        grid.add(answer[3], columns.get(3), 2, 1, 1);
        answer[3].setOnAction(ae -> QuizController.submitAnswer(false));
        answer[3].setFocusTraversable(false);

        Login.primaryStage.setScene(scene);

    }
}

