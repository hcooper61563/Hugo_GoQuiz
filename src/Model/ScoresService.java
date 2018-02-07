/*package Model;

import View.Scores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ScoresService {
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
                                results.getString("Score")

                        ));
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select all error: " + resultsException.getMessage());
        }
    }

/*public static void save (Scores itemToSave ,DatabaseConnection, database){
        Scores existingItem=null;
        if (itemToSave.getID()!=0) existingItem=selectByID(itemToSave.getID(),database);

        try{
            if (existingItem==null){
                PreparedStatement statement= database.newStatement("INSERT into Scores, UserID, QuizID, Score VALUES ")
            }
        }


}
}
*/
