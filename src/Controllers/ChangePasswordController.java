
package Controllers;
import Model.UsersService;
import javafx.scene.control.Alert;

public class ChangePasswordController {
    public static void changePasswordAttempt(String newPassword1, String newPassword2){
        if (newPassword1!=null && newPassword2!=null);{
            if (newPassword1.equals(newPassword2)) {
                if (newPassword1.matches(("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$"))){

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("SUCCESS");
                    alert.setHeaderText("Your password has been...");
                    alert.setContentText("... updated!");
                    alert.showAndWait();

                    UsersService.save(newPassword1);

                }

            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("You didn't enter...");
            alert.setContentText("... enough data");

            alert.showAndWait();
        }
    }
}
