package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Settings {



    public static Scene generateScene() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root);

        Text sceneTitle = new Text("GoSettings");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button button1 = new Button("Home");
        button1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        button1.setOnAction(ae-> Login.primaryStage.setScene(Home.generateScene()));


        Button button3 = new Button("Change Password");
        button3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        button3.setOnAction(ae-> Login.primaryStage.setScene(ChangePassword.generateScene()));

        root.getChildren().addAll(sceneTitle, button1, button3);
        return scene;
    }


}
