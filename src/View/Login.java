package View;


import Controllers.LoginController;
import Model.DatabaseConnection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Login extends Application {

    public static DatabaseConnection database;

    public static Stage primaryStage;

    public static void main(String[] args) {
        database = new DatabaseConnection("coursework_database.db");
        launch(args);
    }


    @Override
    public void start(Stage initialStage) {

        primaryStage = initialStage;

        primaryStage.setTitle("GoQuiz");//Setting my stage
        primaryStage.show();
        primaryStage.setResizable(false);

        GridPane grid = new GridPane();//Creating a grid pane to put my text fields and labels on
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button btn = new Button("Sign in");//This is my sign in button
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("GoQuiz");//Adding text that says 'GoQuiz' under the scenetitle variable
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");//Setting a 'username' label, and adding a text field nex to it
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        userTextField.setText("Steve");     //TEMPORARY!!!

        Label pw = new Label("Password:");//Setting a 'password' label and adding a text field next to it
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        pwBox.setText("Hugo123");        //TEMPORARY!!!

        btn.setOnAction(ae -> LoginController.attemptLogin(userTextField.getText(), pwBox.getText()));

    }
}


