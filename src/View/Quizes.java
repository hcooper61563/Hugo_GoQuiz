package View;

import Controllers.HomeController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Quizes {
    public static Scene generateScene() {
        VBox root = new VBox(50);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Button button1 = new Button("HISTORY");
        button1.setStyle("-fx-font-size: 64pt");

        Button button2 = new Button("ENGLISH");
        button2.setStyle("-fx-font-size: 64pt");

        root.getChildren().addAll( button1, button2);

        return scene;
    }
}
