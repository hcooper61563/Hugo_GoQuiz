package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Home {

        public static Scene generateScene() {

            VBox root = new VBox(10);
            root.setPadding(new Insets(50));

            Scene scene = new Scene(root);

            Text sceneTitle = new Text("GoQuiz Home");
            sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button1 = new Button("Quiz Select");
            button1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button2 = new Button("View Scores");
            button2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button3 = new Button("Settings");
            button3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

            Button button4 = new Button("Sign Out");
            button4.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));


            root.getChildren().addAll(sceneTitle, button1, button2,button3,button4);
            button1.setOnAction(ae -> Login.primaryStage.setScene(QuizSelect.generateScene()));
            button2.setOnAction(ae-> Login.primaryStage.setScene(Scores.generateScene()));
            button3.setOnAction(ae-> Login.primaryStage.setScene(Settings.generateScene()));



            return scene;

        }

}
