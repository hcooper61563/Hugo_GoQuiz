package Controllers;

import Model.Users;
import Model.UsersService;
import View.Home;
import View.Login;
import javafx.scene.control.Alert;

import java.util.ArrayList;



public class LoginController {

    public static void attemptLogin(String username, String password) {

        ArrayList<Users> allUsers = new ArrayList<>();

        UsersService.selectAll(allUsers, Login.database);

        for(Users u: allUsers) {
            if (u.getUsername().equals(username)) {

                if (u.getPassword().equals(password)) {

                    System.out.println("Attempt to login by " + username + " with correct password.");

                    /// NEXT SCENE...

                    Login.primaryStage.setScene(Home.generateScene());

                    return;

                } else {

                    System.out.println("Attempt to login by " + username + " with WRONG password!!!");

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("You got your...");
                    alert.setContentText("...password wrong");

                    alert.showAndWait();

                    return;

                }

            }
        }

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("You got your...");
        alert.setContentText("...username wrong");

        alert.showAndWait();

    }







}
