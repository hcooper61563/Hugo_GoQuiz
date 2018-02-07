package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Scores {
    public static Scene generateScene() {
        VBox root = new VBox(15);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        TableView table = new TableView<>();

        Text sceneTitle = new Text ("GoScores");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button buttonX=new Button("Home");
        buttonX.setFont(Font.font("Tahoma", 20));
        buttonX.setOnAction(ae-> Login.primaryStage.setScene(Home.generateScene()));

        root.getChildren().addAll( sceneTitle,table, buttonX);
        return scene;
    }
}