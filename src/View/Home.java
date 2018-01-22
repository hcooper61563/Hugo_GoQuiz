package View;

import Controllers.HomeController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Home {

        public static Scene generateScene() {

            VBox root = new VBox(10);
            root.setPadding(new Insets(50));

            Scene scene = new Scene(root, 300, 275);

            Text sceneTitle = new Text("GoQuiz Home");
            sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button1 = new Button("Quiz Select");
            button1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button2 = new Button("View Scores");
            button2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            root.getChildren().addAll(sceneTitle, button1, button2);
            button1.setOnAction(ae -> HomeController.moveToQuizes());
            button2.setOnAction(ae-> HomeController.moveToScores());


            return scene;

        }


}
