package Model;

import Controllers.LoginController;
import Controllers.QuizSelectController;
import View.EndOfQuiz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ScoreService {
    public static void selectAll(List<Scores> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT UserID, QuizID, Score FROM Scores");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Scores(
                                results.getInt("UserID"),
                                results.getInt("QuizID"),
                                results.getInt("Score")
                        ));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

    public static void save( int item , DatabaseConnection database) {

        try{
            PreparedStatement statement = database.newStatement("UPDATE Scores SET Score = ? WHERE QuizID = ? AND UserID= ?");
            statement.setInt(1, item);
            statement.setInt(2, QuizSelectController.currentQuiz);
            statement.setInt(3,LoginController.currentUser);
            database.executeUpdate(statement);
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
}

