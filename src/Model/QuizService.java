package Model;

import Model.DatabaseConnection;
import Model.Quiz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QuizService {
    public static void selectAll(List<Quiz> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT QuizID, QuizName FROM Quiz");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Quiz(
                                results.getInt("QuizID"),
                                results.getString("QuizName")

                        ));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }
}
