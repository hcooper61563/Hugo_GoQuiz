package View;

import Controllers.HomeController;
import Controllers.QuizSelectController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class QuizSelect {
    public static Scene generateScene() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Text sceneTitle = new Text("Quiz Select");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button button1 = new Button("Australian History");
        button1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button button2 = new Button("Shakespeare Hamlet");
        button2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        root.getChildren().addAll( button1, button2);

        button1.setOnAction(ae-> QuizSelectController.buildQuiz(button1.getText()));

        return scene;
    }
}
