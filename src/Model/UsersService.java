package Model;

import Controllers.LoginController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsersService {
    public static void selectAll(List<Users> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT UserID, Username, Password FROM Users");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Users(
                                results.getInt("UserID"),
                                results.getString("Username"),
                                results.getString("Password")
                        ));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static void save( String item , DatabaseConnection database) {

            try{
                PreparedStatement statement = database.newStatement("UPDATE Users SET Password = ? WHERE UserID = ?");
                statement.setString(1, item);
                statement.setInt(2, LoginController.currentUser);
                database.executeUpdate(statement);
            } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
}


