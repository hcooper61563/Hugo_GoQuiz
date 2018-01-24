

package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Quiz {

    public static Scene generateScene(String questionX, String answerX) {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));

        Scene scene = new Scene(root, 300, 275);

        System.out.println(questionX + answerX);

        return scene;
    }
}


