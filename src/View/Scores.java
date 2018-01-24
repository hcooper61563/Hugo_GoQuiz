package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Scores {
    public static Scene generateScene() {
        VBox root = new VBox(50);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Button button1 = new Button("LAST QUIZ");
        button1.setStyle("-fx-font-size: 64pt");

        Button button2 = new Button("SECOND TO LAST QUIZ");
        button2.setStyle("-fx-font-size: 64pt");



        Button buttonX=new Button("Home");
        buttonX.setFont(Font.font("Tahoma", 20));
        buttonX.setOnAction(ae-> Login.primaryStage.setScene(Home.generateScene()));

        root.getChildren().addAll( button1, button2,buttonX);
        return scene;
    }
}