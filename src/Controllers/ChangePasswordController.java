
package Controllers;
import Model.UsersService;
import javafx.scene.control.Alert;
import static View.Login.database;

public class ChangePasswordController {
    public static void changePasswordAttempt(String newPassword1, String newPassword2){
        if (newPassword1.isEmpty()|| newPassword2.isEmpty()){//Checks if the fields were left empty and shows error dialog if they are

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("You didn't enter...");
            alert.setContentText("... enough data");

            alert.showAndWait();

        }else if (!newPassword1.equals(newPassword2)) {//Checks if the passwords matched, and shows error dialog if they didn't
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("You didn't enter...");
            alert.setContentText("... the same passwords");
            alert.showAndWait();

        }else if (newPassword1.matches("[^A-Za-z0-9]+")){//Checks if the password contains only letters in English alphabet, and numbers and shows error message if it doesn't
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Your password must be...");
            alert.setContentText("... Letters and numbers only.");
            alert.showAndWait();
        }else{//If the password is valid, it has avoided all the other IF clauses, so ELSE applies
            //Shows alert for successful update
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success!");
            alert.setHeaderText("Your Password was...");
            alert.setContentText("... Updated!");
            alert.showAndWait();


            UsersService.save(newPassword1, database);//Calls UsersService. save, sending nePassword1 as the item to be saved
        }

    }
}








