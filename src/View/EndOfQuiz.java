package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class EndOfQuiz {

    public static Scene generateScene(int score) {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root, 300, 275);

        Text sceneTitle = new Text("Emd of Quiz");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        String displayScore = score;

        Button button1 = new Button("Home");
        button1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        button1.setOnAction(ae -> Home.generateScene());

        root.getChildren().addAll(sceneTitle, displayScore, button1);
        return scene;
    }
}
