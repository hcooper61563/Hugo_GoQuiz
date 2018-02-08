
package View;

import Controllers.ChangePasswordController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ChangePassword {
    public static Scene generateScene() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(50));
//,400, 350
        Scene scene = new Scene(root);

        Text sceneTitle = new Text("GoChange Password");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        HBox pass1= new HBox();
        Label pass1Label= new Label ("New Password: ");
        TextField newPassword1= new TextField();
        pass1.getChildren().addAll(pass1Label,newPassword1);

        HBox pass2= new HBox();
        Label pass2Label= new Label ("Re-enter new password: ");
        PasswordField newPassword2= new PasswordField();
        pass2.getChildren().addAll(pass2Label,newPassword2);

        Button buttonX=new Button("Home");
        buttonX.setFont(Font.font("Tahoma", 20));

        Button buttonY=new Button("Change Password");
        buttonY.setFont(Font.font("Tahoma", 20));

        Button button1=new Button("Back");
        button1.setFont(Font.font("Tahoma", 20));

        button1.setOnAction(ae-> Login.primaryStage.setScene(Settings.generateScene()));
        buttonX.setOnAction(ae-> Login.primaryStage.setScene(Home.generateScene()));
        buttonY.setOnAction(ae-> ChangePasswordController.changePasswordAttempt(newPassword1.getText(),newPassword2.getText()));

        root.getChildren().addAll(sceneTitle,pass1,pass2,buttonY, button1,buttonX);

        return scene;
    }
}
