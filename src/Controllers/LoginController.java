package Controllers;

import Model.Users;
import Model.UsersService;
import View.Home;
import View.Login;
import javafx.scene.control.Alert;

import java.util.ArrayList;



public class LoginController {

    public static void attemptLogin(String inputUsername, String inputPassword) {

        ArrayList<Users> allUsers = new ArrayList<>();//Creates an arrayList to fill user data with
        UsersService.selectAll(allUsers, Login.database);//Calls the select all function within Users and send the ArrayList to be filled

        for(Users u: allUsers) {//Starts a for loop for the length of the array allUsers
            if (u.getUsername().equals(inputUsername)) {//First checks if the input username is equal to the username of element u in allUsers
                if (u.getPassword().equals(inputPassword)) {//If the username is correct, it then checks if the password matches the password of element u in allUsers

                    System.out.println("Successful attempt to login by " + inputUsername + " with correct password.");//Sample output to confirm that the program has tested the username and password

                    /// NEXT SCENE...

                    Login.primaryStage.setScene(Home.generateScene());//If the username and password are correct, it opens a new scene using the View class Home

                    return;

                } else {

                    System.out.println("Attempt to login by " + inputUsername + " with WRONG password!!!");

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("You got your...");
                    alert.setContentText("...password wrong");

                    alert.showAndWait();//If passwords do not match up, this alert is shown

                    return;

                }

            }
        }

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("You got your...");
        alert.setContentText("...username wrong");

        alert.showAndWait();//If usernames do not match up, this alert is shown

    }







}
