package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QuestionService {
    public static void selectAll(List<Question> targetList, DatabaseConnection database) {

        PreparedStatement statement = database.newStatement("SELECT Questions, QuestionID, QuizID, CorrectAnswer, WrongAnswer1, WrongAnswer2, WrongAnswer3 FROM Question");

        try {
            if (statement != null) {

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {
                        targetList.add(new Question(
                                results.getInt("QuizID"),
                                results.getInt("QuizID"),
                                results.getString("Questions"),
                                results.getString("CorrectAnswer"),
                                results.getString("WrongAnswer1"),
                                results.getString("WrongAnswer2"),
                                results.getString("WrongAnswer3")
                        ));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }
}
