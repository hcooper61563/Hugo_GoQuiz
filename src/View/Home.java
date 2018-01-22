package View;

import Controllers.HomeController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Home {

        public static Scene generateScene() {

            VBox root = new VBox(50);
            root.setPadding(new Insets(50));

            Scene scene = new Scene(root);

            Label label = new Label("Hugo's home!");
            label.setStyle("-fx-font-size: 64pt");

            Button button1 = new Button("QUIZZES");
            button1.setStyle("-fx-font-size: 64pt");

            Button button2 = new Button("SCORES");
            button2.setStyle("-fx-font-size: 64pt");

            root.getChildren().addAll(label, button1, button2);

            button1.setOnAction(ae -> HomeController.moveToQuizes());
            button2.setOnAction(ae-> HomeController.moveToScores());


            return scene;

        }


}
