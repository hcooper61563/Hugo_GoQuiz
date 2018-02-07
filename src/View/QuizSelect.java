package View;

import Controllers.QuizSelectController;
import Model.Quiz;
import Model.QuizService;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


import java.util.ArrayList;

public class QuizSelect {
    public static Scene generateScene() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root,300, 275);

        Text sceneTitle = new Text("Quiz Select");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));


        ArrayList<Quiz> allQuizzes= new ArrayList<>();//Creates array list of all Quiz Names and IDs
        QuizService.selectAll(allQuizzes, Login.database);
        root.getChildren().add(sceneTitle);

        for (Quiz q: allQuizzes) {
            System.out.println(q);

            Button button = new Button(q.getQuizName());//Populates buttons with all the Quiz Names
            button.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
            button.setOnAction(ae-> QuizSelectController.buildQuiz(q.getQuizID()));//Gives QuizID of button pressed to QuizSelect controller
            root.getChildren().add(button);

        }

        Button buttonX=new Button("Home");
        buttonX.setFont(Font.font("Tahoma", 20));
        buttonX.setOnAction(ae-> Login.primaryStage.setScene(Home.generateScene()));
        root.getChildren().add(buttonX);

        return scene;
    }
}
