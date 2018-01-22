package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Scores {
    public static Scene generateScene() {
        VBox root = new VBox(50);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Button button1 = new Button("LAST QUIZ");
        button1.setStyle("-fx-font-size: 64pt");

        Button button2 = new Button("SECOND TO LAST QUIZ");
        button2.setStyle("-fx-font-size: 64pt");

        root.getChildren().addAll( button1, button2);

        return scene;
    }
}