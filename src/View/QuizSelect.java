package View;

import Controllers.HomeController;
import Controllers.QuizSelectController;
import Model.Quiz;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class QuizSelect {
    public static Scene generateScene() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Text sceneTitle = new Text("Quiz Select");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));


        ArrayList<Quiz> allTheQuizzes = new ArrayList<>();
        allTheQuizzes.add(new Quiz(1, "Australian History"));
        allTheQuizzes.add(new Quiz(2, "Shakespeare Hamlet"));

        for (Quiz q: allTheQuizzes) {

            Button button = new Button(q.getQuizName());
            button.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            button.setOnAction(ae-> QuizSelectController.buildQuiz(q.getQuizID()));
            root.getChildren().add( button);

        }


        return scene;
    }
}
